/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class CustomerList {

    List<Customer> customers;

    public CustomerList() {
        customers = new ArrayList<>();
    }

    public void add() {
        Customer cust = new Customer();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Input Id: ");
                int n = Integer.parseInt(sc.nextLine());
                cust.setId(n);
                break;
            } catch (Exception ex) {
                System.out.println("Id must be integer");
            }
        }

        String sPattern = "[\\w]{2,10}";
        Pattern pattern = Pattern.compile(sPattern);
        while (true) {
            try {
                System.out.println("Input Name: ");
                String name = sc.nextLine();
                Matcher mat = pattern.matcher(name);
                if (mat.matches()) {
                    cust.setEmail(name);
                    break;
                }
            } catch (Exception ex) {
            }
             System.out.println("Name has 2 characters or more");
        }

        System.out.println("Input Email: ");
        String email = sc.nextLine();
        cust.setEmail(email);
        // dua vao list
        customers.add(cust);
    }

    public void print() {
        customers.forEach(System.out::println);
    }

    public void print2() {
        for (Customer c : customers) {
            System.out.println(c);
        }
    }

    public void save() {
        try {
            PrintWriter out = new PrintWriter(new OutputStreamWriter(
                    new FileOutputStream("customer.txt")));
            customers.forEach(out::println); //method reference
            //customers.forEach(c->out.println(c));
            /*
            for(Customer c : customers) {
                out.println(c);
            }
            */
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    
    
    public void load() {
        try {
            customers.clear(); //xoa du lieu cu
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    new FileInputStream("customer.txt")));
            String buf;
            while ((buf = in.readLine()) != null) {
                StringTokenizer tok = new StringTokenizer(buf, "-");
                Customer customer = new Customer();
                customer.setId(Integer.parseInt((String) tok.nextElement()));
                customer.setName((String) tok.nextElement());
                customer.setEmail((String) tok.nextElement());
                customers.add(customer);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
