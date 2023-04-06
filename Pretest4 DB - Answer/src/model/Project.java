/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Project {
    public int id;
    public String projectName;
    public String startDate;
    public int value;
    public boolean completed;
    
    public Project() {
        id = 0;
        projectName = "";
        startDate = "";
        value = 0;
        completed = false;
    }
    
    public Project(int id, String projectName, String startDate, int value, boolean completed) {
        this.id = id;
        this.projectName = projectName;
        this.startDate = startDate;
        this.value = value;
        this.completed = completed;
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Project Name: ");
        projectName = sc.nextLine();
        System.out.println("Input Date (yyyy-mm-dd): ");
        startDate = sc.nextLine();
        System.out.println("Input Value: ");
        value = Integer.parseInt(sc.nextLine());
        System.out.println("Input Completed: (0/1)");
        int v = Integer.parseInt(sc.nextLine());
        completed = v==1;
    }
    
    @Override
    public String toString() {
        String sCompleted = completed ? "Completed" : "Not Completed";
        return String.format("%d-%s-%s-%d-%s", 
                id, projectName, startDate, value, sCompleted);
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the projectName
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * @param projectName the projectName to set
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the completed
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * @param completed the completed to set
     */
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}