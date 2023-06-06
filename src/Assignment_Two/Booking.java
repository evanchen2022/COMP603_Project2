/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_Two;

/**
 *
 * P08_16932797_21154481
 */
public class Booking
{

    private Flight flight;
    private PassengerInfo[] passengerInfos;
    //private Seat[] seats;
    private SeatType seatType;

    //Constructor to initialise a new booking                     //, Seat[] seats
    public Booking(Flight flight, PassengerInfo[] passengerInfos, SeatType seatType)
    {
        this.flight = flight;
        this.passengerInfos = passengerInfos;
        //this.seats = seats;
        this.seatType = seatType;
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
    public PassengerInfo[] getPassengerInfos()
    {
        return passengerInfos;
    }

    //Setter method to update the array of PassengerInfo objects
    public void setPassengerInfos(PassengerInfo[] passengerInfos)
    {
        this.passengerInfos = passengerInfos;
    }

    //Getter method to return the array of Seat ojbects
//    public Seat[] getSeats()
//    {
//        return seats;
//    }
//    
//    //Setter method to update the array of Seat objects
//    public void setSeats(Seat[] seats)
//    {
//        this.seats = seats;
//    }

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
