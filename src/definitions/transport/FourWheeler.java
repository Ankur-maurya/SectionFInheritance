/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 25/08/20
 *  Time: 1:11 PM
 *  File Name : FourWheeler.java
 * */
package definitions.transport;

// This will be the subclass (child class) for our example.
public class FourWheeler extends Vehicle {
    // Method Overriding
    // this start method is overridden from the Vehicle class (parent class/superclass)
    // this start method is an overridden method
    // @Override // this is called an annotation, annotations are used to modify
    // the behavior of a piece of code.
    @Override
    public void start() {
        System.out.println("FourWheeler has started.");
    }

    // Method Overloading
    // the start method is overloaded
    // the start() method is an overloaded method.
    public void start(String fourWheelerName) {
        System.out.println(fourWheelerName + " has started.");
    }

}

// FourWheeler IS A type of Vehicle.
// FourWheeler extends Vehicle
// <subclass>  extends <superclass>
// Vehicle -> (is inherited by) FourWheeler
// The child class is inheriting from a single parent,
// this is Simple Inheritance.
// superclass -> subclass

// Vehicle class is the super class of FourWheeler class.
// FourWheeler class is the sub class of Vehicle class.

