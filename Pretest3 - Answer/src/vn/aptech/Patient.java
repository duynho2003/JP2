/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Patient {
    private String id;
    private String name;
    private boolean gender;
    private Date examDate;

    public Patient() {
        id = "";
        name = "";
        gender = false;
        examDate = new Date();
    }

    public Patient(String id, String name, boolean gender, Date examDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.examDate = examDate;
    }

    @Override
    public String toString() {
        String sGender = gender ? "Male" : "Female";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String sExamDate = sdf.format(examDate);
        return String.format("%s-%s-%s-%s", id, name, sGender, sExamDate);
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
    public boolean isGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    /**
     * @return the examDate
     */
    public Date getExamDate() {
        return examDate;
    }

    /**
     * @param examDate the examDate to set
     */
    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }
}
