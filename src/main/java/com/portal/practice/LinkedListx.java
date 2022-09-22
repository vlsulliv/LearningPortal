package com.portal.practice;

import java.util.LinkedList;

public class LinkedListx {

    LinkedList<Integer> ll = new LinkedList<Integer>();

    public void addObj(int number) {
        for (int i=0; i< 5; i++) {
            ll.add(i);

            System.out.println(ll);

            ll.indexOf(3);

            System.out.println(ll);

            // Printing elements one by one
            for (int j = 0; j < ll.size(); j++)
                System.out.print(ll.get(i) + " ");
        }
    }

}
