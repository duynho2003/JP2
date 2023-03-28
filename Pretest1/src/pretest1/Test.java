/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pretest1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library list = new Library();
        int choose = 0;
        do {
            System.out.println("1. Xem danh muc sach");
            System.out.println("2. Them 1 sach moi vo thu vien");
            System.out.println("3. Luu danh muc sach vo tap tin van ban");
            System.out.println("4. Exit");
            System.out.println("Choose:");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1: {
                    list.display();
                    break;
                }
                case 2: {
                    list.add();
                    break;
                }
                case 3: {
                    list.save();
                    break;
                }
                default:
                    break;
            }
        } while (choose != 4);
    }
}