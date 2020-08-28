/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 28/08/20
 *  Time: 1:10 PM
 *  File Name : Example3.java
 * */
package definitions.examples;

public class Example3 {
    public static void main(String[] args) {
        B1 objectB1 = new B1();
        objectB1.setValues(10, 9);
        System.out.println(objectB1.product(4, 5));
        C1 objectC1 = new C1();
        objectC1.setValues(35, 7);
        System.out.println(objectC1.division(1, 1));
        System.out.println(objectC1.difference(0,0));
    }
}

class A1 {
    public int i, j;

    void setValues(int x, int y) {
        i = x;
        j = y;
    }

    public int sum(int x, int y) {
        int sum = i + j;
        return sum;
    }
}

class B1 extends A1 {
    public int product(int x, int y) {
        int product = i * j;
        return product;
    }
}

class C1 extends A1 {
    public int division(int x, int y) {
        int division = i / j;
        return division;
    }

    public int difference(int x, int y) {
        int difference = i - j;
        return difference;
    }
}




