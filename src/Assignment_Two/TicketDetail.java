/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_Two;

/**
 *
 * P08_16932797_21154481
 */
public class TicketDetail 
{

    private Flight flight;
    private PassengerInfo passengerInfos;
    private SeatType seatType;
    private double price;

    //Constructor to initialise a new booking
    public TicketDetail(Flight flight, PassengerInfo passengerInfos, SeatType seatType, Double price)
    {
        this.flight = flight;
        this.passengerInfos = passengerInfos;
        this.seatType = seatType;
        this.price = price;
    }

    //Getter method to return the flight object
    public Flight getFlight()
    {
        return flight;
    }

    //Setter method for the flight object
    public void setFlight(Flight flight)
    {
        this.flight = flight;
    }

    //Getter method to return the array of PassengerInfo objects
    public PassengerInfo getPassengerInfos()
    {
        return passengerInfos;
    }

    //Setter method to update the array of PassengerInfo objects
    public void setPassengerInfos(PassengerInfo passengerInfos)
    {
        this.passengerInfos = passengerInfos;
    }
    /*Getter method to return the SeatType
     *Economy or Business class*/
    public SeatType getSeatType()
    {
        return seatType;
    }

    /*Setter method to update the SeatType
     *Economy or Business class*/
    public void setSeatType(SeatType seatType)
    {
        this.seatType = seatType;
    }
}