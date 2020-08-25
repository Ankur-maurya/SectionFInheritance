/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 25/08/20
 *  Time: 11:39 AM
 *  File Name : Phone.java
 * */
package definitions;

// landline; tethered to a wall outlet.
public class Phone {
    private long contactNumber; // the contact number of the phone itself.

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }
}
