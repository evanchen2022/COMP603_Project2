/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_Two;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author evan
 */
public class DBOperations 
{
    private DBManager dbManager;
    
    public DBOperations() {
        dbManager = new DBManager();
    }
    
    public void getQuery() {
        
        Connection connection = dbManager.conn;
        Statement statement = null;
        ResultSet rs = null;
        
        try {
            System.out.println("Getting query from the dataset");
            String sqlQuery = "select * from Users";
            
            statement = connection.createStatement();
            rs = statement.executeQuery(sqlQuery);
            
            while(rs.next()) {
                Integer userID = rs.getInt(1);
                String Name = rs.getString(2);
                String PW = rs.getString(3);
                System.out.println("userID: "+userID);
                System.out.println("userName: "+Name);
                System.out.println("userPassword: "+PW);
                System.out.println("");
            }
            
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
    }
}
