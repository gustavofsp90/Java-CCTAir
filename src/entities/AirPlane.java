/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Gustavo Passos - 2018396
 * @author Micaias Barros - 2018271
 */
public class AirPlane {
    
    private String make;
    private String model;
    private int capacity;
    private String pilot;

    public AirPlane(String make, String model, int capacity, String pilot) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
        this.pilot = pilot;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getPilot() {
        return pilot;
    }
    
    public void assignPilot(String pilot) {
    
        this.pilot = pilot;
        
    }
            
    public String toString() {
    
    return  "Airplane information: Aircraft: "
            + getMake ()
            +" "
            + getModel()
            + " Capacity: "
            + getCapacity()
            + " seats Pilot: "
            + getPilot()
            + ".";                
    }
}
