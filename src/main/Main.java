/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 25/08/20
 *  Time: 11:48 AM
 *  File Name : Main.java
 * */
package main;

import definitions.transport.FourWheeler;
import definitions.transport.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.start(); // Vehicle has started.
        FourWheeler myFourWheeler = new FourWheeler();
        myFourWheeler.start();
    }
}
