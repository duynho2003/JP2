/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

/**
 *
 * @author Admin
 */
public class MainTest {

    public static void main(String[] args) {
        MySingleton ms = MySingleton.getInstance();
        MySingleton ms2 = new MySingleton();// = MySingleton.getInstance

        if (ms == ms2) {
            System.out.println("ms and ms2 are the same memory address");
        }
        System.out.println("Done.");
    }
}
