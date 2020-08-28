/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 28/08/20
 *  Time: 1:38 PM
 *  File Name : Example6.java
 * */
package definitions.examples;

public class Example6 {
    public static void main(String[] args) {
        Bike myBike = new Bike(1, "Passion Pro");
        myBike.displayBikeInformation();
        SuperBike mySuperBike = new SuperBike(2, "Ducati X600", 230.0);
        mySuperBike.displayBikeInformation();
    }
}

class Bike {
    public String modelName;
    private final int idNumber;

    public Bike(int idNumber, String modelName) {
        this.idNumber = idNumber;
        this.modelName = modelName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void displayBikeInformation() {
        System.out.println("ID Number = " + this.idNumber);
        System.out.println("Model Name = " + this.modelName);
    }
}

class SuperBike extends Bike {
    private double maxSpeed;

    public SuperBike(int idNumber, String modelName, double maxSpeed) {
        // the super keyword
        super(idNumber, modelName);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void displayBikeInformation() {
        super.displayBikeInformation();
        System.out.println("Max Speed = " + this.maxSpeed);
    }
}
