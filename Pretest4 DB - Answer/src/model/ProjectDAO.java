/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class ProjectDAO {
    public int insert(Project pro) {
        int result = -1;
        try {
            Connection con = MyLib.connectDb();
            String query = "INSERT INTO tbProject (projectName, startDate, value, completed) VALUES (?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, pro.getProjectName());
            stm.setString(2, pro.getStartDate());
            stm.setInt(3, pro.getValue());
            stm.setBoolean(4, pro.isCompleted());
            if (stm.executeUpdate() > 0) {
                result = 1;
            }
            stm.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public int delete(int id) {
        int result = -1;
        try {
            Connection con = MyLib.connectDb();
            String query = "DELETE FROM tbProject WHERE id=?";
            PreparedStatement stm = con.prepareStatement(query);
            stm.setInt(1, id);
            if (stm.executeUpdate() > 0) {
                result = 1;
            }
            stm.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public List<Project> getList() {
        List<Project> result = new ArrayList<>();
        try {
            Connection con = MyLib.connectDb();
            String query = "SELECT id, projectName, startDate, value, completed FROM tbProject";
            PreparedStatement stm = con.prepareStatement(query);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Project p = new Project();
                p.setId(rs.getInt(1));
                p.setProjectName(rs.getString(2));
                p.setStartDate(rs.getString(3));
                p.setValue(rs.getInt(4));
                p.setCompleted(rs.getBoolean(5));
                result.add(p);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
    
    public List<Project> getCompletedProject() {
        List<Project> result = new ArrayList<>();
        try {
            Connection con = MyLib.connectDb();
            String query = "SELECT id, projectName, startDate, value, completed FROM tbProject WHERE completed=1";
            PreparedStatement stm = con.prepareStatement(query);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Project p = new Project();
                p.setId(rs.getInt(1));
                p.setProjectName(rs.getString(2));
                p.setStartDate(rs.getString(3));
                p.setValue(rs.getInt(4));
                p.setCompleted(rs.getBoolean(5));
                result.add(p);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}