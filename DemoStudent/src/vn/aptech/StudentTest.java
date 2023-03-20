/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class StudentTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList list = new StudentList();
        int choose = 0;
        do {
            System.out.println("1. Create new Student");
            System.out.println("2. Display Student List");
            System.out.println("3. Search Student by name");
            System.out.println("4. Exit");
            System.out.println("Choose");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1: {
                    Student stu = new Student();
                    stu.input();
                    list.addStudent(stu);
                    break;
                }
                case 2: {
                    list.print();
                    break;
                }
                case 3: {
                    System.out.println("Input name: ");
                    String name = sc.nextLine();
                    List<Student> result = list.search(name);
                    result.forEach(System.out::println);
                    break;
                }
                default:
                    break;
            }
        } while (choose != 4);
    }
}