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
public class Registration {
    static int nextRegNo = 1001;
    
    private  int regNo;
    private Car car;
    private CarType carType; // association
    private Owner owner;

    public Registration(Car car, CarType carType, Owner owner) {
        this.car = car;
        this.carType = carType;
        this.owner = owner;
        regNo=nextRegNo;
        nextRegNo++;
    }
    public String toString(){
        return String.format("%d %s %s %s", regNo,owner.toString(), car.toString(),carType.toString());
    }
    
    
}
