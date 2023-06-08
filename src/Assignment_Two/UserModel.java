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
}
