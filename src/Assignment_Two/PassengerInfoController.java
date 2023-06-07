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
public class PassengerInfoController {

    private UserModel userModel;

    public PassengerInfoController(UserModel userModel) {
        this.userModel = userModel;
    }

    public void createPassengerInfoTable() {
        userModel.createPassengerInfoTable();
    }

    public void insertPassengerInfo(PassengerInfo passenger) {
        userModel.insertPassengerInfo(passenger);
    }
}

