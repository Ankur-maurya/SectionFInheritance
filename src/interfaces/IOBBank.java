/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 04/09/20
 *  Time: 1:24 PM
 *  File Name : IOBBank.java
 * */
package interfaces;

// for inheriting classes / abstract classes we use:
// the extends keyword

// for inheriting interfaces we use :
// the implements keyword

public class IOBBank implements Bank, ATM {
    @Override
    public void createAccount() {
        System.out.println("ASK FOR NAME, AGE, EMAIL");
    }

    @Override
    public void withdrawMoney(double amount) {

    }
}
class SBIBank implements Bank, ATM {
    @Override
    public void createAccount() {
        System.out.println("ASK ONLY FOR NAME");
    }

    @Override
    public void withdrawMoney(double amount) {

    }
}