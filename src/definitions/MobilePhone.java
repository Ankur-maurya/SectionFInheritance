/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 25/08/20
 *  Time: 11:41 AM
 *  File Name : MobilePhone.java
 * */
package definitions;

// a simple mobile phone like Noika 1100
public class MobilePhone extends Phone {
    // MobilePhone extends Phone
    // MobilePhone IS A type of Phone
    public void printContactNumber() {
        System.out.println(getContactNumber());
    }

    public void changeContactNumber(long contactNumber) {
        setContactNumber(contactNumber);
    }
}

// The MobilePhone class is inheriting the getContactNumber() method
// from the Phone class.
// The Phone class is the super class/parent class of MobilePhone class.
// The MobilePhone class is the sub class/child class of Phone class.

// Two entities; every entity is a class,
// first entity (class) : Phone.java class
// second entity (class) : MobilePhone.java class
// is somehow relate the two classes (entities)

// MobilePhone IS A type of Phone.
// Phone should have been invented first, and then we (humans) invented a Mobile Phone.