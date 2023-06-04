/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Assignment_Two;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * P08_16932797_21154481
 */

public abstract class PassengerInfo
{

    private String firstName;
    private String lastName;
    private String passportNumber;
    private LocalDate dateOfBirth;
    private String address;
    private String phoneNumber;
    private String email;
    private String clientNumber;

    /*Constructor of PassengerInfo
     *Initialize a new PassengerInfo object with all the necessary fields*/
    public PassengerInfo(String firstName, String lastName, String passportNumber, String dateOfBirth,
            String address, String phoneNumber, String email, String clientNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.dateOfBirth = LocalDate.parse(dateOfBirth, formatter);
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.clientNumber = clientNumber;
    }
    
    //Default constructor for PassengerInfo
    public PassengerInfo() 
    {
        this.firstName = "";
        this.lastName = "";
        this.passportNumber = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.dateOfBirth = LocalDate.now();
        this.address = "";
        this.phoneNumber = "";
        this.email = "";
        this.clientNumber = "";
    }

    //Getter method of first name
    public String getFirstName()
    {
        return firstName;
    }

    //Setter method of first name
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    //Getter method of last name
    public String getLastName()
    {
        return lastName;
    }

    //Setter method of last name
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    //Getter method of passport number
    public String getPassportNumber()
    {
        return passportNumber;
    }

    //Setter method of passport number
    public void setPassportNumber(String passportNumber)
    {
        this.passportNumber = passportNumber;
    }

    //Getter method for date of birth
    public LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }

    //Update the dateOfBirth field of an existing PassengerInfo object
    public void setDateOfBirth(String dateOfBirth)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.dateOfBirth = LocalDate.parse(dateOfBirth, formatter);
    }

    //Getter method of address
    public String getAddress()
    {
        return address;
    }

    //Setter method of address
    public void setAddress(String address)
    {
        this.address = address;
    }

    //Getter method of phone number
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    //Setter method of phone number
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    //Getter method of email
    public String getEmail()
    {
        return email;
    }

    //Setter method of email
    public void setEmail(String email)
    {
        this.email = email;
    }

    //Getter method of client number
    public String getClientNumber()
    {
        return clientNumber;
    }

    //Setter method of client number
    public void setClientNumber(String clientNumber)
    {
        this.clientNumber = clientNumber;
    }

    //Returns true if the passenger is 18 years old or older.
    public abstract boolean isAdult();

    //Returns true if the passenger is between 2 and 17 years old
    public abstract boolean isChild();

    //Returns true if the passenger is younger than 2 years old.
    public abstract boolean isInfant();
  
    
    //print out discount method:
    public void checkDiscount()
    {
        
    }

}


