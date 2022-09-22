package com.portal.practice;

import com.portal.controller.AccessEnum;
import java.util.EnumMap;

/**
 * Sets the tool tip text.
 *
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
        EnumMap<AccessEnum, String> RankMap = new EnumMap<AccessEnum, String>(AccessEnum.class);

        RankMap.put(AccessEnum.ADMIN, "Priority");
        RankMap.put(AccessEnum.MANAGER, "Important tasks that can be delayed");
        RankMap.put(AccessEnum.ADMIN, "Low priority tasks");
        RankMap.put(AccessEnum.EMPLOYEE, "TODO tasks or ideas");

        System.out.println("Size of EnumMap in Java: " + RankMap.size());

        // Printing Java EnumMap
        // Print EnumMap in natural order
        // of enum keys (order on which they are declared)
        System.out.println("EnumMap: " + RankMap);

        // Checking if EnumMap contains a particular key
        System.out.println(
                "Does gfgMap has " + AccessEnum.ADMIN + ": "
                        + RankMap.containsKey((AccessEnum.MANAGER)));

        // Checking if EnumMap contains a particular value
        System.out.println(
                "Does gfgMap has :" + AccessEnum.ADMIN + " : "
                        + RankMap.containsValue("Practice Quizes"));
        System.out.println("Does gfgMap has :" + AccessEnum.EMPLOYEE
                + " : "
                + RankMap.containsValue(null));
    }
}
