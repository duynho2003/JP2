/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DemoList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Quang");
        list.add("Hoang");
        list.add("Tuan");
        list.add("Tung");
        list.add(2,"Hung");
        String[] name = list.toArray(new String[0]);
        for(String s: name){
            System.out.println("Name: " + s);
        }
        
        List myInts = new ArrayList();
        myInts.add(new Integer(5));
        myInts.add(6);
    }
}