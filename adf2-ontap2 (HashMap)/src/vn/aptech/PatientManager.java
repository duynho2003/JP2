package vn.aptech;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PatientManager {

    static HashMap< String, Patient> patientsList;

    public PatientManager() {
        patientsList = new HashMap<>();
    }

    public static void addNew() {
        Patient p = new Patient();
        p.input();
        patientsList.put(p.getID(), p);
    }

    public static void display(String id) {
        Scanner sc = new Scanner(System.in);
        if (patientsList.containsKey(id)) {
            Patient p = patientsList.get(id);
            System.out.println(p);
        } else {
            System.out.println("Khong tim thay");
        }
    }

    public static void save() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("patients.txt", true);
            String line;
            byte[] b;
            for (Patient patient : patientsList.values()) {
                line = patient.toString();
                b = line.getBytes();
                fos.write(b);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PatientManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PatientManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(PatientManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}