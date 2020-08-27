/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 27/08/20
 *  Time: 4:43 PM
 *  File Name : Example2.java
 * */
package definitions.examples;

public class Example2 {
    public static void main(String[] args) {
        D objectD = new D();
        objectD.methodD(5);
        objectD.methodA(4);
    }
}
class A {
    int j = 0;
    public void methodA(int k) { // 1
        j = k;
        System.out.println("Class A : j = " + j);
    }
}
class B extends A {
    @Override
    public void methodA(int x) { // 2
        j = x * x;
        System.out.println("Class B : j = " + j);
    }
    public void methodB() {
        System.out.println("Class B");
    }
}
// Hierarchical Inheritance
class C extends A {
    @Override
    public void methodA(int k1) {
        j = k1 * 5;
        System.out.println("Class Cj = " + j);
    }
    public void methodC() {
        System.out.println("Class C");
    }
}
class D extends B {
    public void methodD(int k) {
        System.out.println("Class D");
    }
}












