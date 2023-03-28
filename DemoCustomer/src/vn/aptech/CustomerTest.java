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
public class CustomerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerList list = new CustomerList();
        int choose = 0;
        while (choose !=5){
            System.out.println("1. Create customer");
            System.out.println("2. Print Customer List");
            System.out.println("3. Save To File");
            System.out.println("4. Read from File");
            System.out.println("5. Exit");
            System.out.println("Choose:");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1: {
                    list.add();
                    break;
                }
                case 2: {
                    list.print();
                }
                case 3: {
                    list.save();
                }
                case 4: {
                    list.load();
                }
                default: break;
            }
        }
        
        // mo file customer.txt bang notepad
        File f = new File("customer.txt");
        if (f.exists()) {
            Runtime rt = Runtime.getRuntime();
            try {
                rt.exec("notepad customer.txt");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
