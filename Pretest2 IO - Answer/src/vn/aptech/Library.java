/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Library {

    HashSet<Book> books;

    public Library() {
        books = new HashSet<>();
    }

    public void add(Book b) {
        if (books.add(b)) {
            System.out.println("New Book add successfully");
        } else {
            System.out.println("This book already exits");
        }

    }

    public void display() {
        System.out.println("List of book in the library: ");
        books.forEach(System.out::println);
    }

    public void saveBooks() {
        try {
            PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("bookList.txt")));
            for (Book b : books) {
                out.println(b);
            }
            out.close();

            Runtime rt = Runtime.getRuntime();
            rt.exec("notepad bookList.txt");
            System.out.println("Save book catalog to file successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("\n-----------Menu-----------");
            System.out.println("1. Add new book");
            System.out.println("2. Display list of book");
            System.out.println("3. Save book to file");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Book b = new Book();
                    b.input();
                    add(b);
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    saveBooks();
                    break;
                case 0:
                    ProcessBuilder pb = new ProcessBuilder("Notepad.exe", "bookList.txt");
                     {
                        try {
                            pb.start();
                        } catch (IOException ex) {
                            Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                default:
                    break;
            }
        } while (choice != 4);
    }

    public static void main(String[] args) {
//        Library library = new Library();
        new Library().menu();
    }
}
