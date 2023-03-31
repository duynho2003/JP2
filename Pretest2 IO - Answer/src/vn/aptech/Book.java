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
public class Book {
    private String bookId;
    private String title;
    private int price;
    private String publisher;
    
    public Book(){
    }
    
    public Book(String bookId, String title, int price, String publisher) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.publisher = publisher;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Id:");
        bookId = sc.nextLine();
        System.out.println("Input Title:");
        title = sc.nextLine();
        System.out.println("Input Price:");
        price = Integer.parseInt(sc.nextLine());
        System.out.println("Input Publisher (OUP / CUP): ");
        publisher = sc.nextLine();
        
    }
    
    @Override
    public String toString() {
        return String.format("%s-%s-%d-$s", bookId, title, price, 
                standardizedPublisher());
    }
    
    public String standardizedPublisher() {
        String result = null;
        if(publisher.equals("OUP")) {
            result = "Oxford University Press";
        } else if (publisher.equals("CUP")) {
            result = "Cambridge University Press";
        }
        return result;
    }
    /**
     * @return the bookId
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * @param bookId the bookId to set
     */
    public void setBookID(String bookId) {
        this.bookId = bookId;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
