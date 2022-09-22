package com.portal.practice;

import com.portal.controller.UserAccess;
import java.util.EnumMap;

/**
 * Sets the tool tip text.
 *
 * @param text  the text of the tool tip
 */
public class Driver {

    // Access Specifier Keywork ReturnType MethodName(Array of String Type)
    public static void main(String[] args) {
        mountainBike mb = new mountainBike(3, 4, 5);

        /*
        System.out.println(mb.toString());
        System.out.println(utility.Multiply(1,2));
        System.out.println(utility.Multiply(2, 4));

        bicycle bike = new bicycle(1,2);
        touringBike tBike= new touringBike(2,3);

        bike.print();
        tBike.print();
        */

        /*
        DataStructures collection = new DataStructures();
        collection.addNum(1);
        */

        /*ArrayList.addNum(2);*/

        LinkedListx ll = new LinkedListx();
        ll.addObj(3);

        // EnumMap
        // Creating an empty EnumMap with key
        EnumMap<UserAccess, String> RankMap = new EnumMap<UserAccess, String>(UserAccess.class);

        RankMap.put(UserAccess.FIRST, "Priority");
        RankMap.put(UserAccess.SECOND, "Important tasks that can be delayed");
        RankMap.put(UserAccess.THIRD, "Low priority tasks");
        RankMap.put(UserAccess.FOURTH, "TODO tasks or ideas");

        System.out.println("Size of EnumMap in Java: " + RankMap.size());

        // Printing Java EnumMap
        // Print EnumMap in natural order
        // of enum keys (order on which they are declared)
        System.out.println("EnumMap: " + RankMap);

        // Checking if EnumMap contains a particular key
        System.out.println(
                "Does gfgMap has " + UserAccess.FIRST + ": "
                        + RankMap.containsKey((UserAccess.SECOND)));

        // Checking if EnumMap contains a particular value
        System.out.println(
                "Does gfgMap has :" + UserAccess.THIRD + " : "
                        + RankMap.containsValue("Practice Quizes"));
        System.out.println("Does gfgMap has :" + UserAccess.FOURTH
                + " : "
                + RankMap.containsValue(null));
    }
}
