/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 01/09/20
 *  Time: 1:08 PM
 *  File Name : DynamicMethodDispatch.java
 * */
package definitions.binding;

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Bike myBike = new Bike();
//        myBike.displaySpeed();
        RacingBike myRacingBike = new RacingBike();
//        myRacingBike.displaySpeed();
        MotoGPBike myGPBike = new MotoGPBike();
//        myGPBike.displaySpeed();

        Bike superBike = myRacingBike;
        superBike.displaySpeed();
    }
}

class Bike {
    public void displaySpeed() {
        System.out.println("Bike Speed: 120 km/h");
    }

    public void displayBikeInformation() {
        System.out.println("Bike class.");
    }
}

class RacingBike extends Bike {
    @Override
    public void displaySpeed() {
        System.out.println("RacingBike Speed: 200 km/h");
    }

    public void displayRacingBikeInformation() {
        System.out.println("RacingBike class.");
    }
}

class MotoGPBike extends RacingBike {
    @Override
    public void displaySpeed() {
        System.out.println("MotoGPBike Speed: 300 km/h");
    }

    public void displayMotoGPBikeInformation() {
        System.out.println("MotoGPBike class.");
    }
}
