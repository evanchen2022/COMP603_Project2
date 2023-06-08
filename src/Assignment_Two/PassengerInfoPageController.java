/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Assignment_Two;

/**
 *
 * Student Name: Zhicong Wang
 * Student ID:   21154481
 */
public class PassengerInfoPageController {

    private PassengerInfoPageModel passengerModel;

    public PassengerInfoPageController(PassengerInfoPageModel passengerModel) {
        this.passengerModel = passengerModel;
    }

    public void createPassengerInfoTable() {
        passengerModel.createPassengerInfoTable();
    }

    public void insertPassengerInfo(PassengerInfo passenger) {
        passengerModel.insertPassengerInfo(passenger);
    }
}

