/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 01/09/20
 *  Time: 11:12 AM
 *  File Name : StaticBinding.java
 * */
package definitions.binding;

public class StaticBinding {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.display();
    }
}

class Vehicle {
    public void display() {
        System.out.println("Vehicle class.");
    }
}

class Car extends Vehicle {
    public void displayCarColor() {
        System.out.println("The Car is Black.");
    }
}
