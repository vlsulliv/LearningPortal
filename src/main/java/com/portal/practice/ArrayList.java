package com.portal.practice;

public class ArrayList {

    // Create new ArrayList
    static java.util.ArrayList<Integer> numberList = new java.util.ArrayList<Integer>();

    // Method to add objects to arrayList, removes one element, and prints results
    static void addNum(int number) {
        for (Integer i = 0; i < 5; i++)
            // adding Integers to arrayList
            numberList.add(i);

        // Print ArrayList
        System.out.println(numberList);

        // Remove Integer at index three
        numberList.remove(3);

        // Verify index is removed
        System.out.println(numberList);

        // Print values one by one
        for (int i = 0; i < numberList.size(); i++)
            System.out.print(numberList.get(i) + " ");
    }
}
