/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Admin
 */
public class MyMain {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("t1");
        t1.start();

        MyThread t2 = new MyThread();
        t2.setName("t2");
        t2.start();

//        MyRunnable r1 = new MyRunnable();
//        Thread tr1 = new Thread(r1);
//        tr1.start();
        int n = 10;
        AtomicInteger ai = new AtomicInteger(n);
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                ai.set(20);
            }
        };

        Thread tr2 = new Thread(r2);
        tr2.start();

        try {
            // hàm join() y/c main thread cho t1, t2 thead ket thuc thi moi ket thuc
            t1.join();
            t2.join();
            tr2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("ai = " + ai.get());
        System.out.println("Done.");
    }
}
