/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_Two;

/**
 *
 * P08_16932797_21154481
 */

import java.time.LocalDate;
import java.time.Period;

public class InfantPassengerInfo extends PassengerInfo
{
    //Constructor of InfantPassengerInfo with all the necessary fields
    public InfantPassengerInfo(String firstName, String lastName, String passportNumber, String dateOfBirth, String address, String phoneNumber, String email, String clientNumber) {
        super(firstName, lastName, passportNumber, dateOfBirth, address, phoneNumber, email, clientNumber);
    }
    
    //Returns true if the passenger is younger than 2 years old.
    @Override
    public boolean isInfant()
    {
        return Period.between(getDateOfBirth(), LocalDate.now()).getYears() < 2;
    }
    
    //Display the discount message
    @Override
    public String checkDiscount()
    {
        return "50% off for infant's ticket. Enjoy the discount!!";
    }

    @Override
    public boolean isAdult()
    {
        return false;
    }

    @Override
    public boolean isChild()
    {
        return false;
    }
    
}

