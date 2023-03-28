/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pretest2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Product {
    private int id;
    private String name;
    private int price;
    private int qoh;
    
    public Product(){
}
    public Product(int id, String name, int price, int qoh) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qoh = qoh;
    }
    
    @Override
    public String toString() {
        return String.format("%d-%s-%d-%d", id, name, price, qoh);
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        String prd;
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

    /**
     * @return the qoh
     */
    public int getQoh() {
        return qoh;
    }

    /**
     * @param qoh the qoh to set
     */
    public void setQoh(int qoh) {
        this.qoh = qoh;
    }
}
