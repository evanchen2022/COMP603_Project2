/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Assignment_Two;

/**
 *
 * P08_16932797_21154481
 */
public class PassengerInfoPageController {

    private PassengerInfoPageModel passengerModel;

    // Constructor of PassengerInfoPageController
    public PassengerInfoPageController(PassengerInfoPageModel passengerModel) {
        this.passengerModel = passengerModel;
    }

    /* Call the createPassengerInfoTable method of the passengerModel object to 
     * create the passenger information table in the database.*/
    public void createPassengerInfoTable() {
        passengerModel.createPassengerInfoTable();
    }

    /* Call the insertPassengerInfo method of the passengerModel object to 
     * insert the passenger information table into the database.*/
    public void insertPassengerInfo(PassengerInfo passenger) {
        passengerModel.insertPassengerInfo(passenger);
    }
}

