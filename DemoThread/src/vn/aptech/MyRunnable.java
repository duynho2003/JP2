/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

/**
 *
 * @author Admin
 */
public class MyRunnable implements Runnable{
    
    @Override
    public void run() {
        for (int i = 0; i < 50; i++){
            System.out.println("i: " + i);
        }
    }
}
