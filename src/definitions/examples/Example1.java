/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 27/08/20
 *  Time: 4:34 PM
 *  File Name : Example1.java
 * */
package definitions.examples;

public class Example1 {
    public static void main(String[] args) {

    }
}
class DemoA {
    public void displayA() {
        System.out.println("Parent Class Method.");
    }
}
class DemoB extends DemoA {
    @Override
    public void displayA() { // Method Overriding
        System.out.println("Child Class Method.");
    }
}
