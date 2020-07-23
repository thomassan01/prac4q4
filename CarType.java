
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical4;

/**
 *
 * @author DK
 */
public class CarType {
   private String make; 
   private String model ;
   private double capacity ;

    public CarType(String make, String model, double capacity) {
        this.make = make;
        this.model = model;
        this.capacity = capacity; //we asign value as default
    }

    public String toString() {
        return String.format("%-10s %-10s %-10s", this.make, this.model, this.capacity);
    }
 
   
}
