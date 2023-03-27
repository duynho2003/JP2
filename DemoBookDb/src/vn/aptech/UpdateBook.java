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
public class UpdateBook {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1500;databaseName=Demo";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String query = "UPDATE books SET title=?, price=? WHERE id=?";
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, "Book 8");
            stm.setInt(2, 100);
            stm.setInt(3,2);
            int result = stm.executeUpdate();
            if (result > 0){
                System.out.println("Update success");
            } else {
                System.out.println("Update failed.");
            }
            System.out.println("Done.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
