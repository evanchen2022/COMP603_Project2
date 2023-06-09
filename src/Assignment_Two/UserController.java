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
public class UserController
{
    private UserModel userModel;

    // Constructor of UserController
    public UserController(UserModel userModel)
    {
        this.userModel = userModel;
    }

    // To verify the input username and password
    public boolean verifyUser(String username, String password)
    {
        try
        {
            return userModel.checkUser(username, password);
        } catch (SQLException e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
