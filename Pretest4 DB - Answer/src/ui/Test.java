/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

/**
 *
 * @author Admin
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Project;

public class Test {

    private Connection getConnect() {
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1500;databaseName=javaDB";
            con = DriverManager.getConnection(url, "sa", "123");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

    public int insert(Project pro) {

        int result = -1;
        try {
            Connection con = getConnect();
            String sql = "INSERT INTO tbProject(projectName, startDate, value, completed) VALUES (?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, pro.projectName);
            stm.setString(2, pro.startDate);
            stm.setInt(3, pro.value);
            stm.setBoolean(4, pro.completed);
            //int rows = stm.executeUpdate();
            //return rows;
            if (stm.executeUpdate() > 0) {
                result = 1;
            }
            stm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public int delete(String pID) {
        int result = -1;
        try {
            Connection con = getConnect();
            PreparedStatement stm = con.prepareStatement("DELETE FROM tbProject WHERE id =?");
            stm.setInt(1, Integer.parseInt(pID));
//                int rows = stm.executeUpdate();
//                return rows;
            if (stm.executeUpdate() > 0) {
                result = 1;
            }
            stm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Project> getList() {
        Connection con = getConnect();
        List<Project> projects = new ArrayList<>();

        try {
            Statement stm = con.createStatement();
            String query = "SELECT * from tbProject";
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Project pro = new Project();
                pro.id = rs.getInt("id");
                pro.projectName = rs.getString("projectName");
                pro.startDate = rs.getString("startDate");
                pro.value = rs.getInt("value");
                pro.completed = rs.getBoolean("completed");
                projects.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return projects;

    }

    public List<Project> getComplatedProject() {
        List<Project> projects = new ArrayList<>();
        Connection con = getConnect();
        try {
            if (con != null) {
                Statement stm = con.createStatement();
                String query = "Select * from tbProject Where completed=1";
                ResultSet rs = stm.executeQuery(query);

                while (rs.next()) {
                    Project pro = new Project();
                    pro.id = rs.getInt("id");
                    pro.projectName = rs.getString("projectName");
                    pro.startDate = rs.getString("startDate");
                    pro.value = rs.getInt("value");
                    pro.completed = rs.getBoolean("completed");
                    projects.add(pro);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return projects;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Test proTest = new Test();
        int choose = 0;

        do {
            System.out.println("1.Add new project");
            System.out.println("2.Delete project");
            System.out.println("3.Get list of all projects");
            System.out.println("4.Get list of completed projects");
            System.out.println("5.Exit");
            System.out.println("Choose: ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    Project p = new Project();
                    p.input();
                    int result = proTest.insert(p);
                    if (result > 0) {
                        System.out.println("Project added successfully.");
                    } else {
                        System.out.println("Failed to add project.");
                    }
                    break;
                case 2:
                    System.out.print("Enter project ID to delete: ");
                    String deleteID = sc.nextLine();
                    result = proTest.delete(deleteID);
                    if (result > 0) {
                        System.out.println("Project deleted successfully.");
                    } else {
                        System.out.println("Failed to delete project.");
                    }
                    break;
                case 3:
                    List<Project> projectList = proTest.getList();
                    System.out.println("List of all projects:");
                    projectList.forEach(System.out::println);
                    break;
                case 4:
                    List<Project> completedProjects = proTest.getComplatedProject();
                    System.out.println("List of completed projects:");
                    completedProjects.forEach(System.out::println);
                    break;

                default:
                    break;
            }
        } while (choose != 5);
    }
}
