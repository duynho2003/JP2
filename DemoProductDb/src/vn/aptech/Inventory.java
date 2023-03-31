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
public class Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        ProductDao dao = new ProductDao();
        while(choose !=4) {
            System.out.println("1. Display Product List");
            System.out.println("2. Add new Product");
            System.out.println("3. Find by Name");
            System.out.println("4. Exit");
            System.out.println("Choose: ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1: {
                    
                    break;
                }
                case 2: {
                    Product p = new Product();
                    p.input(); // nhap lieu
                    if (dao.create(p)) {
                        System.out.println("Add new Product success.");
                    } else {
                        System.out.println("Failed to create new Product.");
                    }
                    break;
                }
                case 3:{
                    
                    break;
                }
                default: break;
            }
        }
    }
}
