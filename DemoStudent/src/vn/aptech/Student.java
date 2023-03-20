/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class Student {

    private String id;
    private String name;
    private String email;

    public Student() {
    }

    @Override
    public String toString() {
        return String.format("Student [Id: %s, Name: %s, Email: %s]", id, name, email);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        String buf;

        String sIdPat = "Stu[\\d]{4}";
        Pattern idPat = Pattern.compile(sIdPat);
        while (true) {
            System.out.print("Input Id: ");
            buf = sc.nextLine();
            Matcher mat = idPat.matcher(buf);
            if (mat.matches()) {
                id = buf;
                break;
            } else {
                System.out.println("Id wrong format, it has form: Stu0000");
            }
        }

        System.out.print("Input Name: ");
        buf = sc.nextLine();
        name = buf;

        System.out.print("Input Email: ");
        buf = sc.nextLine();
        email = buf;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
