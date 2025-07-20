package za.ac.student_trade.util;

import java.util.UUID;

public class Helper {

    public static String generateId(){return UUID.randomUUID().toString();}

    //Todo: Validate Email
    //Todo: Validate Price > 0
    //Todo: firstName, lastName, email, and password is not Null
    //Todo: validate postal code > 999 && postal code < 10000

}
