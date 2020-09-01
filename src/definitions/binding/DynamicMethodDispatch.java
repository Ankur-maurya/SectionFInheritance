/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 01/09/20
 *  Time: 1:08 PM
 *  File Name : DynamicMethodDispatch.java
 * */
package definitions.binding;

public class DynamicMethodDispatch {
    public static void main(String[] args) {

    }
}

class Bike {
    public void displaySpeed() {
        System.out.println("Bike Speed: 120 km/h");
    }
}

class RacingBike extends Bike {
    @Override
    public void displaySpeed() {
        System.out.println("RacingBike Speed: 200 km/h");
    }
}

class MotoGPBike {

}
