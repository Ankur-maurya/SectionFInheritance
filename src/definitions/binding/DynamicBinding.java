/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 01/09/20
 *  Time: 11:19 AM
 *  File Name : DynamicBinding.java
 * */
package definitions.binding;

public class DynamicBinding {
    public static void main(String[] args) {
        Airplane myAirplane = new Jet();
        // We can create an object of the child class, and
        // store the reference value of the object in a
        // reference variable of its parent class.
        myAirplane.display();
    }
}

class Airplane {
    public void display() {
        System.out.println("Airplane class.");
    }
}

class Jet extends Airplane {
    @Override
    public void display() {
        System.out.println("Jet class.");
    }

    public void showFuelStatus() {
        System.out.println("Sufficient Fuel Remaining.");
    }
}
