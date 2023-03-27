/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

/**
 *
 * @author Admin
 */
public class MyThread extends Thread {
    
    @Override
    public void run() {
        synchronized (System.out) {
            for (int i = 0; i < 50; i++) {
                System.out.println(getName() + ": " + i);                
            }

//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException ex){
//                ex.printStackTrace();
//            }
        }
    }
    
}
