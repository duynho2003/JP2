/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Book implements Serializable{
    private int id;
    private String name;
    private int price;
    
    public Book() {
    }
    
    @Override
    public String toString() {
        return String.format("%d-%s-%d", id, name, price);
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Id: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Input Name: ");
        name = sc.nextLine();
        System.out.println("Input Price: ");
        price = Integer.parseInt(sc.nextLine());
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
}
