/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class DemoPattern {
    public static void main(String[] args) {
        String pattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher("quang@gmail.com");
        if (m.matches()) {
            System.out.println("Right Email");
        } else {
            System.out.println("Wrong Email");
        }
        
        List<Integer> list = List.of(1, 2, 3);
        for (int n : list)  {
            System.out.println("n = " + n);
        }
    }
}
