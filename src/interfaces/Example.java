/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 04/09/20
 *  Time: 1:15 PM
 *  File Name : Bank.java
 * */
package interfaces;

public interface Example {

    // 1. Fields
    // i. all the fields declared inside an interface must be initialized.
    // ii. all the fields declared inside an interface are implicitly declared
    // as public.
    // iii. all the fields declared inside an interface are implicitly declared
    // as final i.e we cannot change its value after is has initialized.
    // iv. all the fields declared inside an interface are implicitly declared
    // as static.
    // public static final <dataType> <variableName> = <initialValue>;
    public static final int number = 4;

    // 2. Methods
    // i. all the method declared inside an interface are implicitly declared
    // as abstract.
    // ii. all the methods declared inside an interface are implicitly declared
    // as public.
    // public abstract <dataType> <methodName>(<Parameters>);
    public abstract void method();

}
