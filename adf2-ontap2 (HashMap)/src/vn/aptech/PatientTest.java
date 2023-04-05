/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static vn.aptech.PatientManager.addNew;
import static vn.aptech.PatientManager.display;
import static vn.aptech.PatientManager.save;

/**
 *
 * @author Admin
 */
public class PatientTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PatientManager pm = new PatientManager();
        int choose = 0;
        while (choose != 4) {
            System.out.println("1. New Patient");
            System.out.println("2. Display patient");
            System.out.println("3. Save list of patients");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    addNew();
                    break;
                case 2:
                    System.out.println("Nhap id ma ban can tim: ");
                    String id = sc.nextLine();
                    display(id);
                    break;
                case 3:
                    save();
                    break;
                case 4:
                    //hien thi dung notepad
                    Runtime rt = Runtime.getRuntime();
                    try {
                        rt.exec("notepad patients.txt");
                    } catch (IOException ex) {
                        Logger.getLogger(PatientManager.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choose again");
            }
        }
    } 
}
