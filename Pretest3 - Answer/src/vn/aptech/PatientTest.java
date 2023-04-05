/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PatientTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PatientManager pm = new PatientManager();
        int choose;
        do {
            System.out.println("1. Create new Patient");
            System.out.println("2. Display patient by Id");
            System.out.println("3. Save list of patient");
            System.out.println("4. Exit");
            System.out.println("Choose:");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1: {
                    pm.addNew();
                    break;
                }
                case 2: {
                    System.out.print("Input Patient Id:");
                    String s = sc.nextLine();
                    pm.display(s);
                    break;
                }
                case 3: {
                    pm.save();
                    break;
                }
                default: break;
            }
        } while (choose != 4);

        // display file "patient.txt" dung notepad
        try {
            File f = new File("patient.txt");
            if (f.exists()) {
                Runtime rt = Runtime.getRuntime();
                rt.exec("notepad patient.txt");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}