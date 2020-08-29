/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 29/08/20
 *  Time: 1:07 PM
 *  File Name : Example7.java
 * */
package definitions.examples;

public class Example7 {
    public static void main(String[] args) {
        Airplane airbus = new Airplane(380);
        airbus.displayInformation();
        Jet privateJet = new Jet(47, 410);
        privateJet.displayInformation();
        FighterJet rafael = new FighterJet(24, 480, 8);
        rafael.displayInformation();
    }
}

class Airplane {
    private final int airplaneID;

    public Airplane(int airplaneID) {
        this.airplaneID = airplaneID;
    }

    public int getAirplaneID() {
        return airplaneID;
    }

    public void displayInformation() {
        System.out.println("airplaneID = " + airplaneID);
    }
}

class Jet extends Airplane {
    int maxSpeed;

    public Jet(int airplaneID, int maxSpeed) {
        super(airplaneID);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("maxSpeed = " + maxSpeed);
    }
}

class FighterJet extends Jet {
    private int numberOfMissiles;

    public FighterJet(int numberOfMissiles) {
        super(0, 0);
        this.numberOfMissiles = numberOfMissiles;
    }

    public FighterJet(int airlineID, int maxSpeed, int numberOfMissiles) {
        super(airlineID, maxSpeed);
        this.numberOfMissiles = numberOfMissiles;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("numberOfMissiles = " + numberOfMissiles);
    }
}