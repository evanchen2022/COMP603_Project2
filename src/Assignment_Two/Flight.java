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

// This class is the helper, it will help in the HomePage.
// Since we will need to generate some needed information for processing the booking step.
// And this is helper for the interaction between HomePage and PaasengerInfoPage.  
public class Flight
{

    private String departure;
    private String destination;
    private String date;
    private String time;

    // Constructor to initialise the Flight object
    public Flight(String departure, String destination, String date, String time)
    {
        this.departure = departure;
        this.destination = destination;
        this.date = date;
        this.time = time;
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

    @Override
    public String toString() {
        return "Flight{" + "departure=" + departure + ", destination=" + destination + ", date=" + date + ", time=" + time + '}';
    }
    
    
}

