/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 01/09/20
 *  Time: 11:19 AM
 *  File Name : DynamicBinding.java
 * */
package definitions.binding;

public class DynamicBinding {
    public static void main(String[] args) {
        Airplane myAirplane = new Airplane();
        myAirplane.display();
        Jet myJet = new Jet();
        myJet.display();
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
}
