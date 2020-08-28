/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 28/08/20
 *  Time: 1:27 PM
 *  File Name : Example5.java
 * */
package definitions.examples;

public class Example5 {
    public static void main(String[] args) {

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
        System.out.println("j = " + j + ", k = " + k);
    }

    public int getJ() {
        return j;
    }

    public int getK() {
        return k;
    }
}
