/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 *
 * @author Admin
 */
public class DemoDataInput {
    public static void main(String[] args) {
        try {
            DataInputStream in = new DataInputStream(new FileInputStream("data.dat"));
            int n = in.readInt();
            double dd = in.readDouble();
            in.close();
            System.out.println("n = " + n + ", d = " + dd);
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
