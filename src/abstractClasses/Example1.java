/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 04/09/20
 *  Time: 1:05 PM
 *  File Name : Example1.java
 * */
package abstractClasses;

public class Example1 {
    public static void main(String[] args) {

    }
}

abstract class Human { // this is now an abstract class.
    abstract public void talk();
    // this is now an abstract method.
    // abstract : something that is not properly defined
    // abstract method : a method whose body is not properly defined
    // implementing (overriding an abstract method)
}

class Student extends Human {
    @Override
    public void talk() {

    }
}

class Teacher extends Human {
    @Override
    public void talk() {
        System.out.println("I am a Teacher.");
    }
}
