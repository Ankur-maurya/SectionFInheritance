/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 27/08/20
 *  Time: 4:43 PM
 *  File Name : Example2.java
 * */
package definitions.examples;

public class Example2 {
    public static void main(String[] args) {

    }
}
class A {
    int j = 0;
    public void methodA(int k) {
        j = k;
        System.out.println("Class A : j = " + j);
    }
}
class B extends A {
    public void methodA(int x) {
        j = x * x;
        System.out.println("Class B : j = " + j);
    }
    public void methodB() {
        System.out.println("Class B");
    }
}













