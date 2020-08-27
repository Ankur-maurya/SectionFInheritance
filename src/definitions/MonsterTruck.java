/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 27/08/20
 *  Time: 4:16 PM
 *  File Name : MonsterTruck.java
 * */
package definitions;

import definitions.transport.Truck;

public class MonsterTruck extends Truck {
    // we can access the Truck class
    // in a different class, even outside the package!
    private Truck myMonsterTruck;

    public void startMonsterTruck() {
        startTruck();
    }

}
