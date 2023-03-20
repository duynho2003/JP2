/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DemoGeneric {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(8);
        //list.add("12");
        list.add(6);

        for (Object n : list) {
            int nValue = (int) n;
            System.out.println("n = " + n);
        }

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(9);
        list2.add(4);
        list2.add(8);
//        list2.add("12");
        list2.add(6);

        MyArray<String> ma = new MyArray<>(String.class);
        ma.add("quang");
        ma.add("sinh");
        ma.add("nguyen");
        int n = 10;

        DemoGeneric dg = new DemoGeneric();
        dg.print("Quang");
        
        int k = 100_000;
    }

    public <T> void print(T n) {
        System.out.println("n = " + n);
    }
    
}
