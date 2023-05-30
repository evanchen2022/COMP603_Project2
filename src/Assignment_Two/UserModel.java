/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_Two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserModel 
{                                       //jdbc:derby://localhost:1527/BookingSystem
    private static final String URL = "jdbc:derby://localhost:1527/BookingSystem";  
    private static final String USER_NAME = "evan";
    private static final String PASSWORD = "1234";
    
    Connection conn;
    
    public UserModel() 
    {
        establishConnection();
    }
    
    public void establishConnection() 
    {
        if( this.conn == null) 
        {
            try 
            {
                conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
                System.out.println("Get connected Successfully.");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    public void closeConnections()
    {
        if(conn != null)
        {
            try
            {
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    public ResultSet queryDB(String sql)
    {
        Connection connection = this.conn;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while(resultSet.next())
            {
                Integer userID = resultSet.getInt(1);
                String Name = resultSet.getString(2);
                String PW = resultSet.getString(3);
                System.out.println("userID: "+userID);
                System.out.println("userName: "+Name);
                System.out.println("userPassword: "+PW);
                System.out.println("");
            }
            resultSet.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return resultSet;
    }
    
    
    public static void main(String[] args)
    {
        UserModel newO = new UserModel();
        String sql = "select * from users";
        newO.queryDB(sql);
        
    }
    
}