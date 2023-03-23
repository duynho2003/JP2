/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.File;
/**
 *
 * @author Admin
 */
public class DemoReader {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(
                    new FileInputStream("data.txt")))) {
            //FileInputStream fin = new FileInputStream("data.txt");
            //InputStreamReader fread = new InputStreamReader(fin);
            //BufferedReader in = new BufferedReader(fread);
            String s = in.readLine();
            //in.close();
            System.out.println("s = " + s);
            System.out.println("Done.");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}