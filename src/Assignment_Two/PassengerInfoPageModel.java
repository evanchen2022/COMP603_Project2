/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_Two;

/**
 *
 * P08_16932797_21154481
 */
public class PassengerInfoPageModel
{

    private DBOperations dbOperations;

    //Constructor of PassengerInfoPageModel
    public PassengerInfoPageModel()
    {
        dbOperations = new DBOperations();
    }

    // To create the passenger information table in database through DBOperation
    public void createPassengerInfoTable()
    {
        dbOperations.createPassengerInfoTable();
    }

    // To insert the passenger information into dataset through DBOperation
    public void insertPassengerInfo(PassengerInfo passenger)
    {
        dbOperations.insertPassengerInfo(passenger);
    }
    
}
