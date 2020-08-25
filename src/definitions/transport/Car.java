/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 25/08/20
 *  Time: 1:16 PM
 *  File Name : Car.java
 * */
package definitions.transport;

public class Car extends Vehicle {
    public void startCar() {
        start(); // start() method is defined inside the Vehicle class.
    }
}

// Car IS A type of (Vehicle/FourWheeler) ?
// Car IS A type of Vehicle. CORRECT!
// Car IS A type of FourWheeler. CORRECT!
