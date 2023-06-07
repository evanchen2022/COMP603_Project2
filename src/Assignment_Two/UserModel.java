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
{                                       

    public DBManager userPart;
    public DBOperations userOper;

    public UserModel()
    {
        userPart = new DBManager();
        userOper = new DBOperations();
    }

    public boolean checkUser(String username, String password) throws SQLException
    {
        return userOper.checkUser(username, password);
    }
    
    public void createBookedTicketTable() throws SQLException {
        userOper.createBookedTicketTable();
    }
    
    public void createPassengerInfoTable() {
        userOper.createPassengerInfoTable();
    }

    public void insertPassengerInfo(PassengerInfo passenger) {
        userOper.insertPassengerInfo(passenger);
    }



//    private static final String URL = "jdbc:derby:BookingSystem;create=true";  
//    private static final String USER_NAME = "evan";
//    private static final String PASSWORD = "1234";
//    
//    Connection conn;
//    
//    public UserModel() 
//    {
//        establishConnection();
//    }
//    
//    public void establishConnection() 
//    {
//        if( this.conn == null) 
//        {
//            try 
//            {
//                conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
//                System.out.println("Get connected Successfully.");
//            } catch (SQLException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
//    }
//    
//    public void closeConnections()
//    {
//        if(conn != null)
//        {
//            try
//            {
//                conn.close();
//            } catch (SQLException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
//    }
//    
//    public ResultSet queryDB(String sql)
//    {
//        Connection connection = this.conn;
//        Statement statement = null;
//        ResultSet resultSet = null;
//        
//        try {
//            statement = connection.createStatement();
//            resultSet = statement.executeQuery(sql);
//            while(resultSet.next())
//            {
//                Integer userID = resultSet.getInt(1);
//                String Name = resultSet.getString(2);
//                String PW = resultSet.getString(3);
//                System.out.println("userID: "+userID);
//                System.out.println("userName: "+Name);
//                System.out.println("userPassword: "+PW);
//                System.out.println("");
//            }
//            resultSet.close();
//            
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//        
//        return resultSet;
//    }
//    
}
