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
public class DisplayBook {

    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1500;databaseName=Demo";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String query = "SELECT id, title, price FROM books";
            Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs = stm.executeQuery(query);
            rs.next();
            String title = rs.getString(2);
            System.out.println(title);
            
            rs.updateString(2, "New Book 1");
            rs.updateRow();
//            rs.next();
//            title = rs.getString(2);
//            System.out.println(title);
//            
//            rs.previous();
//            title = rs.getString(2);
//            System.out.println(title);
//            while (rs.next()) {
//                int id = rs.getInt(1);
//                String title = rs.getString(2);
//                int price = rs.getInt(3);
//                System.out.printf("%d-%s-%d\n", id, title, price);
//            }
            // dong ket noi
            rs.close();
            stm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
