/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 27/08/20
 *  Time: 4:08 PM
 *  File Name : Truck.java
 * */
package definitions.transport;

// If we create a public class in Java,
// the name of the class (Truck)
// the name of the file  (Truck.java)
// should be exactly the same!

// outer class
class Truck extends Vehicle {

    void startTruck() {
        System.out.println("Truck is starting...");
    }

    // inner class
    protected class Engine {

    }

}
class DeliveryTruck extends Truck {
    // we can access the Truck class in the same file.
    private Truck myTruck;

    public void startDeliveryTruck() {
        startTruck();
    }
}









