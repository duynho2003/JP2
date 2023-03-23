/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoDataOutput {
    public static void main(String[] args) {
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream("data.dat"));
            out.writeInt(4);
            out.writeDouble(4.5);
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
