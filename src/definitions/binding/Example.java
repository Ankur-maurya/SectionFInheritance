/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 01/09/20
 *  Time: 11:04 AM
 *  File Name : Example.java
 * */
package definitions.binding;

public class Example {
    public static void main(String[] args) {
        A objectA = new A();
        objectA.methodA(); // method call
    }
}

class A {
    public void methodA() { // method body
        System.out.println("method of class A");
    }
}

class B {
    public void methodB() {
        System.out.println("method of class B");
    }
}
