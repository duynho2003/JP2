/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.sql.*;
/**
 *
 * @author Admin
 */
public class CreateBook {
    public static void main(String[] args) {
        try {
            // 1. Nap driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // 2. Mo ket noi
            String url = "jdbc:sqlserver://localhost:1500;databaseName=Demo";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String sql = "INSERT INTO books (title, price) VALUES (?, ?)";
            // 3. Tao doi tuong Statement 
            //Statement stm = con.createStatement();
            PreparedStatement stm = con.prepareStatement(sql);
            // 4. Gui cau truy van, cau lenh INSERT, cho SQL Server thi hanh
            // 4.1. Dung PreparedStatement => thiet lap du lieu
            stm.setString(1, "Book 5");
            stm.setInt(2, 40);
            // 4.2. Thi hanh cau truy van
            int result = stm.executeUpdate();
            // 5. Xu ly ket qua.
            if (result > 0) {
                System.out.println("Insert data successfully.");
            } else {
                System.out.println("Insert failed");
            }
            System.out.println("Done.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
