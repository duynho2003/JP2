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
public class BookTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList list = new BookList();
        int choose = 0;
        do {
            System.out.println("1. Create new Book");
            System.out.println("2. Display Book List");
            System.out.println("3. Search Book by name");
            System.out.println("4. Save file");
            System.out.println("5. Load file");
            System.out.println("6. Exit");
            System.out.println("Choose:");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1: {
                    Book boo = new Book();
                    boo.input();
                    list.addBook(boo);
                    break;
                }
                case 2: {
                    list.print();
                    break;
                }
                case 3: {
                    System.out.println("Input name: ");
                    String name = sc.nextLine();
                    List<Book> result = list.findByName(name);
                    result.forEach(System.out::println);
                    break;
                }
                case 4: {
                    list.saveFile();
                    break;
                }
                case 5: {
                    list.loadFile();
                    break;
                }
                default:
                    break;
            }
        } while (choose != 6);
    }
}