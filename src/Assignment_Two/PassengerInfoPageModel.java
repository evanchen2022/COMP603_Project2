/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_Two;

/**
 *
 * Student Name: Zhicong Wang Student ID: 21154481
 */
public class PassengerInfoPageModel
{

    private DBOperations dbOperations;

    public PassengerInfoPageModel()
    {
        dbOperations = new DBOperations();
    }

    public void createPassengerInfoTable()
    {
        dbOperations.createPassengerInfoTable();
    }

    public void insertPassengerInfo(PassengerInfo passenger)
    {
        dbOperations.insertPassengerInfo(passenger);
    }
}
