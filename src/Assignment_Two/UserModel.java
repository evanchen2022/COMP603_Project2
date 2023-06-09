/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_Two;

import java.sql.SQLException;

/**
 *
 * P08_16932797_21154481
 */

public class UserModel
{

    public DBManager userPart;
    public DBOperations userOper;

    // Constructor of UserModel
    public UserModel()
    {
        userPart = new DBManager();
        userOper = new DBOperations();
    }

    // Call checkUser method of the userOper object to check if the provided username and password exist in the database
    public boolean checkUser(String username, String password) throws SQLException
    {
        return userOper.checkUser(username, password);
    }
}
