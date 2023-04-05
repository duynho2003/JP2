/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Patient {

    private String ID;
    private String name;
    private String gender;
    private String examDate;

    public Patient() {
    }

    public Patient(String ID, String name, String gender, String examDate) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.examDate = examDate;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Id:");
        ID = sc.nextLine();
        System.out.println("Input name:");
        name = sc.nextLine();
        System.out.println("Input gender:");
        gender = sc.nextLine();
        System.out.println("Input examDate: ");
        examDate = sc.nextLine();
    }

    @Override
    public String toString() {
        return String.format("%s-%s-%s-%s", ID, name, gender, examDate);
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the examDate
     */
    public String getExamDate() {
        return examDate;
    }

    /**
     * @param examDate the examDate to set
     */
    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }
}
