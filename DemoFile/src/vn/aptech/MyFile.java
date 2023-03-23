/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.io.File;

/**
 *
 * @author Admin
 */
public class MyFile {
    public static void main(String[] args) {
        File f = new File("demo.txt");
        if (f.exists()) {
            System.out.println("have file");
        } else {
            System.out.println("file not found");
        }
        
        File f2 = new File("myDir");
        if (f2.mkdir()){
            System.out.println("Create new Directory success");
        } else {
            System.out.println("Create new Directory Fail");
        }
    }
}
