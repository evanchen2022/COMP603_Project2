/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Assignment_Two;

/**
 *
 * P08_16932797_21154481
 */

public class User
{
    private String username;
    private String password;

    //Constructor to initialise a new user
    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    
    

    //Getter method for username
    public String getUsername()
    {
        return username;
    }

    //Getter method for password
    public String getPassword()
    {
        return password;
    }
}
