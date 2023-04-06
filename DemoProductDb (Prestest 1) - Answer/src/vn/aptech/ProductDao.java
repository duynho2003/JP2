/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ProductDao {
    private Connection connectDb() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1500;databaseName=Demo";
        return DriverManager.getConnection(url, "sa", "123");
    }
    public List<Product> findAll() {
        List<Product> result = new ArrayList<>();
        try {
            Connection con = connectDb();
            String query = "SELECT id, name, price, qoh FROM tbProduct";
            PreparedStatement stm = con.prepareStatement(query);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setPrice(rs.getInt(3));
                p.setQoh(rs.getInt(4));
                result.add(p);
            }
            rs.close();
            stm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Product> findByName(String name) {
        List<Product> result = new ArrayList<>();
        try {
            Connection con = connectDb();
            String query = "SELECT id, name, price, qoh FROM tbProduct WHERE name LIKE ?";
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, name);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setPrice(rs.getInt(3));
                p.setQoh(rs.getInt(4));
                result.add(p);
            }
            rs.close();
            stm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean create(Product p) {
        boolean result = false;
        try {
            Connection con = connectDb();
            String query = "INSERT INTO tbProduct (name, price, qoh) VALUES (?,?,?)";
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, p.getName());
            stm.setInt(2, p.getPrice());
            stm.setInt(3, p.getQoh());
            result = stm.executeUpdate() > 0;
            stm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean update(Product p) {
        boolean result = false;
        try {
            Connection con = connectDb();
            String query = "UPDATE tbProduct SET name=?, price=?, qoh=? WHERE id=?";
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, p.getName());
            stm.setInt(2, p.getPrice());
            stm.setInt(3, p.getQoh());
            stm.setInt(4, p.getId());
            result = stm.executeUpdate() > 0;
            stm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean delete(int id) {
        boolean result = false;
        try {
            Connection con = connectDb();
            String query = "DELETE FROM tbProduct WHERE id=?";
            PreparedStatement stm = con.prepareStatement(query);
            stm.setInt(1, id);
            result = stm.executeUpdate() > 0;
            stm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}