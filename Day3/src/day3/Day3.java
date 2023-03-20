/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class Day3 {

    public static void main(String[] args) {
        Integer[] arr = {1, 7, 2, 4, 6, 9};
        for (int a: arr){
            System.out.println(a + " ");
        }
        System.out.println("");
        System.out.println("Sorting array.");
//        Arrays.sort(arr, new MyComparator());

        Arrays.sort(arr, (a, b) -> b -a );
        
        for (int a: arr) {
            System.out.println(a + " ");
        }
        System.out.println("");
    }
    
    class MyComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }
}
