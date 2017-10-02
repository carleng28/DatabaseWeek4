/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseweek4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class DBUtil {
    
    private static Connection conn;
    
    private DBUtil(){}
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
    
        Class.forName("oracle.jdbc.driver.OracleDriver");
         
        if (conn!=null){
        
            return conn;
        
        }else {
        
            String url = "jdbc:oracle:thin:@dilbert.humber.ca:1521:grok";
            String username = "n01205440";
            String password = "oracle";

            conn = DriverManager.getConnection(url, username,password);
            return conn;

        }
    
    }
    
    public static void closeConnection() throws SQLException{

        if (conn!=null){
        
            conn.close();
        }
        
    }
}
