/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 *
 * @author Admin
 */
public class DemoWriter {
    public static void main(String[] args) {
        String s = "Welcome to T1.2208.A0 class";
        try{
            PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("data.txt")));
            out.println(s);
            out.close();
            System.out.println("Done.");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
