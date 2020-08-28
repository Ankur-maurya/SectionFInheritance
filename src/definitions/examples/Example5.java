/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 28/08/20
 *  Time: 1:27 PM
 *  File Name : Example5.java
 * */
package definitions.examples;

public class Example5 {
    public static void main(String[] args) {
        A2 objectA2 = new A2();
        B2 objectB2 = new B2();
        objectA2.setValues(4, 5);
        objectA2.m = 10;
        objectA2.displayA();
        objectB2.p = 5;
        objectB2.m = 6;
        objectB2.displayB();
        objectB2.setValues(12, 15);
        System.out.println("j = " + objectB2.getJ());
        System.out.println("k = " + objectB2.getK());
    }
}
class A2 {
    private int j;
    private int k;

    public void setValues(int x, int y) {
        j = x;
        k = y;
    }

    public int m;

    void displayA() {
        System.out.println("j = " + j + ", k = " + k + ", m = " + m);
    }

    public int getJ() {
        return j;
    }

    public int getK() {
        return k;
    }
}
class B2 extends A2 {
    int p;

    void displayB() {
        System.out.println("p = " + p);
        System.out.println("m = " + m);
    }
}