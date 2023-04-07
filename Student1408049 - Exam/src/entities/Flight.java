package entities;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Flight {
    private String AircraftCode;
    private String Source;
    private String Destination;
    private String DepTime;
    private int JourneyHrs;
    
    public Flight() {
        AircraftCode = "";
        Source = "";
        Destination = "";
        DepTime = "";
        JourneyHrs = 0;
    }

    public Flight(String AircraftCode, String Source, String Destination, String DepTime, int JourneyHrs) {
        this.AircraftCode = AircraftCode;
        this.Source = Source;
        this.Destination = Destination;
        this.DepTime = DepTime;
        this.JourneyHrs = JourneyHrs;
    }
    
    @Override
    public String toString() {
        return String.format("%s-%s-%s-%s-%d", AircraftCode, Source, Destination, DepTime, JourneyHrs);
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input AircraftCode:");
        AircraftCode = sc.nextLine();
        System.out.println("Input Source:");
        Source = sc.nextLine();
        System.out.println("Input Destination:");
        Destination = sc.nextLine();
        System.out.println("Input DepTime:");
        DepTime = sc.nextLine();
        System.out.println("Input JourneyHrs:");
        JourneyHrs = Integer.parseInt(sc.nextLine());
//        while (true) {
//            System.out.print("Input JoruneyHrs: ");
//            JourneyHrs = Integer.parseInt(sc.nextLine());
//            if (JourneyHrs >= 0 && JourneyHrs <= 20) {
//                break;
//            } else {
//                System.out.println("Journey Hours must be between 1 and 19, please re-enter:");
//            }
//        }
//    }
    }
    /**
     * @return the AircraftCode
     */
    public String getAircraftCode() {
        return AircraftCode;
    }

    /**
     * @param AircraftCode the AircraftCode to set
     */
    public void setAircraftCode(String AircraftCode) {
        this.AircraftCode = AircraftCode;
    }

    /**
     * @return the Source
     */
    public String getSource() {
        return Source;
    }

    /**
     * @param Source the Source to set
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * @return the Destination
     */
    public String getDestination() {
        return Destination;
    }

    /**
     * @param Destination the Destination to set
     */
    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    /**
     * @return the DepTime
     */
    public String getDepTime() {
        return DepTime;
    }

    /**
     * @param DepTime the DepTime to set
     */
    public void setDepTime(String DepTime) {
        this.DepTime = DepTime;
    }

    /**
     * @return the JourneyHrs
     */
    public int getJourneyHrs() {
        return JourneyHrs;
    }

    /**
     * @param JourneyHrs the JourneyHrs to set
     */
    public void setJourneyHrs(int JourneyHrs) {
        this.JourneyHrs = JourneyHrs;
    }
}
