/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseweek4;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlo
 */
public class StudentDB {
    
    public static void add(Student std) throws SQLException, ClassNotFoundException{
    
        String sql = "Insert into student (studentnum, firstname, lastname, address, gpa) "
                + "values (?,?,?,?,?)";
        Connection conn = DBUtil.getConnection();
        
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, std.getStudentNumber());
        ps.setString(2, std.getFirstName());
        ps.setString(3, std.getLastName());
        ps.setString(4, std.getAddress());
        ps.setDouble(5, std.getGpa());
    
        ps.executeUpdate();
    
    } 
    
    public static Student get(int studentNum) throws SQLException, ClassNotFoundException{
    
        String sql = "Select * from student where studentnum = ?";
        Connection conn = DBUtil.getConnection();
        
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, studentNum);
        
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()){
        
            Student std = new Student();
            std.setStudentNumber(rs.getInt("studentNum"));
            std.setFirstName(rs.getString("firstName"));
            std.setLastName(rs.getString("lastName"));
            std.setAddress(rs.getString("address"));
            std.setGpa(rs.getDouble("gpa"));
            rs.close();
            return std;
        
        }else {
        
            rs.close();
            return null;
        }
    
    }
    
    public static List<Student> getAll() throws SQLException, ClassNotFoundException{
    
        String sql = "Select * from student";
        List<Student> students = new ArrayList<>();
        Connection conn = DBUtil.getConnection();
        
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()){
        
            Student std = new Student();
            std.setStudentNumber(rs.getInt("studentNum"));
            std.setFirstName(rs.getString("firstName"));
            std.setLastName(rs.getString("lastName"));
            std.setAddress(rs.getString("address"));
            std.setGpa(rs.getDouble("gpa"));
            students.add(std);
        }
        return students;
    
    }
}
