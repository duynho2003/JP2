/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Admin
 */
public class BookList {

    List<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public void print() {
        books.forEach(System.out::println);
    }

    public List<Book> findByName(String name) {
        return books.stream()
                .filter(b -> b.getName().contains(name))
                .collect(Collectors.toList());
    }

    public void saveFile() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("book.dat"));
            out.writeObject(books);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadFile() {
        try {
            books.clear(); // xoa du lieu cu
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("book.dat"));
            List<Book> result = (List<Book>) in.readObject();
            in.close();
            books.addAll(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
