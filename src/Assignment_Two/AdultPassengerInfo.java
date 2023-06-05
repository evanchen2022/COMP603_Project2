/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_Two;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * P08_16932797_21154481
 */

public class AdultPassengerInfo extends PassengerInfo
{
    
    //Constructor of AdultPassengerInfo with all the necessary fields
    public AdultPassengerInfo(String firstName, String lastName, String passportNumber, String dateOfBirth, String address, String phoneNumber, String email, String clientNumber) {
        super(firstName, lastName, passportNumber, dateOfBirth, address, phoneNumber, email, clientNumber);
    }
    
    //Default constructor of AdultPassengerInf
    public AdultPassengerInfo() 
    {
        super();
    }
    
    //Returns true if the passenger is 18 years old or older.
    @Override
    public boolean isAdult()
    {
        return Period.between(getDateOfBirth(), LocalDate.now()).getYears() >= 18;
    }
    
    //Display the discount message
    @Override
    public void checkDiscount()
    {
        System.out.println("No discount for Adult.");
    }

    
    @Override
    public boolean isChild()
    {
       return false;
    }

    @Override
    public boolean isInfant()
    {
        return false;
    }
            
}
