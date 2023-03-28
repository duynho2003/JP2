/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pretest1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;

/**
 *
 * @author Admin
 */
public class Library {

    private HashSet<Book> bookSet = new HashSet<>();

    public void add() {
        Book book = new Book();
        book.input();
        if (this.bookSet.add(book)) {
            System.out.println("=> Them sach moi hoan tat !!!");
        } else {
            System.out.println("Khong the them sach!!!");
        }
    }

    public void display() {
        int i = 1;
        for (Book book : this.bookSet) {
            System.out.printf("%d. %s\n", i, book.toString());
            i++;
        }
    }

    public void save() {
        try {
            PrintWriter writer = new PrintWriter(new File("bookList.txt"));
            for (Book book : this.bookSet) {
                writer.println(book.toString());
            }
            writer.close();
            System.out.println("Danh muc sach da duoc luu trong file bookList.txt.");
        } catch (FileNotFoundException e) {
            System.out.println("Khong the tao file!");
        }
    }
}
