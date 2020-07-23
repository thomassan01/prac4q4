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
public class Car {
   private String platenumber;
    private String color;
    private int year;
   

    public Car(String platenumber, String color, int year) {
        this.platenumber = platenumber;
        this.color = color;
        this.year = year;
      
    }
    public String toString(){
    return String.format("%10s %-11s %5d" , platenumber,color , year);
    }
    
    
    
}
