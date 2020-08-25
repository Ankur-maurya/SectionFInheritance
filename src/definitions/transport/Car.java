/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 25/08/20
 *  Time: 1:16 PM
 *  File Name : Car.java
 * */
package definitions.transport;

public class Car  {
    public void startCar() {
//        start(); // start() method is defined inside the Vehicle class.
    }
}

// Car IS A type of (Vehicle/FourWheeler) ?
// Car IS A type of Vehicle. CORRECT!
// Car IS A type of FourWheeler. CORRECT!

// Vehicle -> FourWheeler -> Car
// Vehicle class is the superclass of FourWheeler class.
// FourWheeler class is the subclass of Vehicle class.
// FourWheeler class is superclass of Car class.
// Car class is the subclass of FourWheeler class.
// Vehicle (grandparent), FourWheeler (parent), Car (child).