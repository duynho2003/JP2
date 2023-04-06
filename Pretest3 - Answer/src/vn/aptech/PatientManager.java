/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class PatientManager {

    Map<String, Patient> patientsList;

    public PatientManager() {
        patientsList = new HashMap<>();
    }

    public void addNew() {
        Patient patient = new Patient();

        Scanner sc = new Scanner(System.in);
        String sIdPat = "BN\\d\\d\\d\\d";
        Pattern idPat = Pattern.compile(sIdPat);
        while (true) {
            System.out.println("Input Patient Id: ");
            String s = sc.nextLine();
            Matcher mat = idPat.matcher(s);
            if (mat.matches()) {
                patient.setId(s);
                break;
            }
            System.out.println("Invaild Patient Id, please try again.");
        }
        System.out.println("Input Name: ");
        patient.setName(sc.nextLine());
        System.out.println("Input Gender (Male/Female): ");
        String s = sc.nextLine();
        if (s.equals("Male")) {
            patient.setGender(true);
        } else {
            patient.setGender(false);
        }
        while (true) {
            try {
                System.out.println("Input Exam Date (15-03-2023): ");
                s = sc.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                Date dd = sdf.parse(s);
                patient.setExamDate(dd);
                break;
            } catch (Exception e) {
                System.out.println("Exam Date wrong format.");
            }
        }

        patientsList.put(patient.getId(), patient);
    }

    public void display(String id) {
        if (patientsList.containsKey(id)) {
            System.out.println(patientsList.get(id));
        } else {
            System.out.println("Patient with id = " + id + " not exist.");
        }
    }

    public void save() {
        try {
            PrintWriter out = new PrintWriter(new OutputStreamWriter(
                    new FileOutputStream("patient.txt")));
            patientsList.values().forEach(out::println);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
