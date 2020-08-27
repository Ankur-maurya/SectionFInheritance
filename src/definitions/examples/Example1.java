/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 27/08/20
 *  Time: 4:34 PM
 *  File Name : Example1.java
 * */
package definitions.examples;

public class Example1 {
    public static void main(String[] args) {
        DemoA objectA = new DemoA();
        objectA.displayA();
        DemoB objectB = new DemoB();
        objectB.displayA();
    }
}
class DemoA {
    public void displayA() { // 1
        System.out.println("Parent Class Method.");
    }
}
class DemoB extends DemoA {
    @Override
    public void displayA() { // 2 - Method Overriding
        System.out.println("Child Class Method.");
    }
}
