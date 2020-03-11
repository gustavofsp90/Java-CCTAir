/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;

/**
 *
 * @author Gustavo Passos - 2018396
 * @author Micaias Barros - 2018271
 */
public class Flight {
    // Create the private variable to preserve the class encapsulation. 
        // No one outside the class can see the variable.
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private String dateOfFlight;
    private AirPlane aircraftAssigned;

    public Flight(String origin, String destination, String dateOfFlight, AirPlane aircraftAssigned) {
        // Create a constructor parameterized, which is used to initialize attributes. It is takes in all values to make the Flghts
        this.origin = origin;
        this.destination = destination;
        this.dateOfFlight = dateOfFlight;
        this.aircraftAssigned = aircraftAssigned;
    }
    
    //overload of constructor
    
      public Flight(String origin, String destination, String departureTime, String  arrivalTime, String dateOfFlight, AirPlane aircraftAssigned) {
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.dateOfFlight = dateOfFlight;
        this.aircraftAssigned = aircraftAssigned;
    }
     // Create getter methods to get the value stored in specific variables.

    public String getOrigin() {
        return origin;
    }

  
    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getDateOfFlight() {
        return dateOfFlight;
    }
 
    public AirPlane getAircraftAssigned() {
        return aircraftAssigned;
    }
public void schedule (String arrivalTime){

    this.arrivalTime = arrivalTime;
    
}

//method for schedule flights
 
public void schedule (String arrivalTime, String departureTime){

    this.arrivalTime = arrivalTime;
    this.departureTime = departureTime;
    
    // a method to convert list in array
}    
  public static Flight[] convertWithStream(List<Flight> list) {
        return list.stream().toArray(Flight[]::new);
    }
 
  // Create method toString to get all information from within the class at once.
@Override
    public String toString() {
    
        return 
        "Flight Information: \n"
        + "Date: "  
        + getDateOfFlight()
        + "\n"
        +"From: "
        + getOrigin()
        +"\n"
        +"To: "
        + getDestination()
        + "\n"
        + "Departure time: "
        + getDepartureTime()
        + "\n"
        + "Arrival time: "
        + getArrivalTime()
        + "\n"
        + getAircraftAssigned().toString();
    }           
    
}
