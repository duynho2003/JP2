package service;

import entities.Flight;
import java.sql.*;
import java.util.*;

public class FlightService {

    List<Flight> list;

    public FlightService() {
        list = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnect() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1500;databaseName=AirportDB", "sa", "123");

            return cn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Flight> findAll() {
        try {
            Connection ac = getConnect();

            String query = "SELECT * FROM Flight order by JourneyHrs";
            PreparedStatement stm = ac.prepareStatement(query);
            ResultSet rs = stm.executeQuery();

            list.clear();

            while (rs.next()) {
                Flight p = new Flight();

                p.setAircraftCode(rs.getString(1));
                p.setSource(rs.getString(2));
                p.setDestination(rs.getString(3));
                p.setDepTime(rs.getString(4));
                p.setJourneyHrs(rs.getInt(5));

                list.add(p);
            }
            rs.close();
            stm.close();
            ac.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }

    public boolean add(Flight _p) {
        boolean result = false;
        try {
            Connection ac = getConnect();

            PreparedStatement stm = ac.prepareStatement(
                    "INSERT INTO Flight (AircraftCode, [Source], Destination, DepTime, JourneyHrs) VALUES( ?,  ?,  ?, CONVERT(datetime,  ?, 120),  ?) ");

            stm.setString(1, _p.getAircraftCode());
            stm.setString(2, _p.getSource());
            stm.setString(3, _p.getDestination());
            stm.setString(4, _p.getDepTime());
            stm.setInt(5, _p.getJourneyHrs());

            result = stm.executeUpdate() > 0;

            stm.close();
            ac.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }

    public boolean update(Flight _p) {
        boolean result = false;
        try {
            Connection ac = getConnect();

//            PreparedStatement stm = ac.prepareStatement("update Flight set AircraftCode=?, [Source]=?, Destination=?, DepTime=?, JourneyHrs=?");
            PreparedStatement stm = ac.prepareStatement("update Flight set JourneyHrs=? where AircraftCode=?");

            stm.setInt(1, _p.getJourneyHrs());
            stm.setString(2, _p.getAircraftCode());

            result = stm.executeUpdate() > 0;

            stm.close();
            ac.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        var dao = new FlightService();
        Scanner sc = new Scanner(System.in);
        List<Flight> ds = dao.findAll();

        int choice = 0;

        do {
            System.out.println("1. Create new flight");
            System.out.println("2. Find all");
            System.out.println("3. Update flight");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    Flight _p = new Flight();
                    _p.input();

                    boolean rs2 = dao.add(_p);
                    if (rs2) {
                        System.out.println("Add flight successfully");
                        ds = dao.findAll();
                    } else {
                        System.err.println("Error");
                    }
                    break;
                case 2:
                    if (ds == null) {
                        System.err.println("No flight available!");
                        break;
                    }

                    ds.forEach(_p2 -> System.out.println(_p2.toString()));
                    break;
                case 3:
                    if (ds == null) {
                        System.err.println("No flight available!");
                        break;
                    }
                    String _id2;
                    Flight _p2 = null;
                    boolean found = false;

                    while (true) {
                        System.out.println("Enter AircraftCode to update: ");
                        _id2 = (sc.nextLine());

                        for (Flight d : ds) {
                            if (_id2.equalsIgnoreCase(d.getAircraftCode())) {
                                System.out.println("Enter new journeyHrs: ");
                                int jhr = Integer.parseInt(sc.nextLine());
                                _p2 = new Flight(d.getAircraftCode(), d.getSource(), d.getDestination(), d.getDepTime(), jhr);
                                found = true;
                            }
                        }
                        if (found == false) {
                            System.err.println("AircraftCode not found! Please try again!");
                        }
                        break;
                    }

                    if (found == true) {
                        boolean rs3 = dao.update(_p2);
                        if (rs3) {
                            System.out.println("Update success");
                            ds = dao.findAll();
                        } else {
                            System.err.println("Error");
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 4);
    }
}
