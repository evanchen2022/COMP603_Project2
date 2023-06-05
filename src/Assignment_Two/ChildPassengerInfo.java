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

public class ChildPassengerInfo extends PassengerInfo
{
    
    //Constructor of ChildPassengerInfo with all the necessary fields
    public ChildPassengerInfo(String firstName, String lastName, String passportNumber, String dateOfBirth, String address, String phoneNumber, String email, String clientNumber) {
        super(firstName, lastName, passportNumber, dateOfBirth, address, phoneNumber, email, clientNumber);
    }
    
    //Returns true if the passenger is between 2 and 17 years old
    @Override
    public boolean isChild()
    {
        int age = Period.between(getDateOfBirth(), LocalDate.now()).getYears();
        return age >= 2 && age < 12;
    }
    
    //Display the discount message
    @Override
    public void checkDiscount()
    {
        System.out.println("No discount for children.");
    }

    @Override
    public boolean isAdult()
    {
       return false;
    }

    @Override
    public boolean isInfant()
    {
        return false;
    }
}

