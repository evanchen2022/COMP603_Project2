/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_Two;

/**
 *
 * P08_16932797_21154481
 */

import java.util.LinkedList;
import java.util.List;

public class Flight
{

    private String departure;
    private String destination;
    private String date;
    private String time;
    private boolean isInternational;

    // Constructor to initialise the Flight object
    public Flight(String departure, String destination, String date, String time)
    {
        this.departure = departure;
        this.destination = destination;
        this.date = date;
        this.time = time;
        this.isInternational = isInternational();
    }

    //Getter method of departure
    public String getDeparture()
    {
        return departure;
    }

    //Setter method of departure
    public void setDeparture(String departure)
    {
        this.departure = departure;
    }

    //Getter method of Destination
    public String getDestination()
    {
        return destination;
    }

    //Setter method of Destination
    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    //Getter method of date
    public String getDate()
    {
        return date;
    }

    //Setter method of date
    public void setDate(String date)
    {
        this.date = date;
    }

    //Getter method of time
    public String getTime()
    {
        return time;
    }

    //Setter method of Time
    public void setTime(String time)
    {
        this.time = time;
    }

    //Getter method of isInternational
    public boolean getIsInternational()
    {
        return isInternational;
    }

    /* To find out if the flight is international
     * List of domestic airports
     * If both departure and destination are in the list of domestic airports,
     * the flight is not international. Otherwise, it is international.*/
    private boolean isInternational()
    {
        List<String> domesticAirports = new LinkedList<>();
        domesticAirports.add("Auckland (AKL)");
        domesticAirports.add("Christchurch (CHC)");
        domesticAirports.add("Wellington (WLG)");
        domesticAirports.add("Queenstown (ZQN)");

        return !(domesticAirports.contains(departure) && domesticAirports.contains(destination));
    }
}

