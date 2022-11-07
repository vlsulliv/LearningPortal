package com.portal.practice;

public class driver {

    public static void main(String[] args) {
        mountainBike mb = new mountainBike(3, 4, 5);

        System.out.println(mb.toString());
        System.out.println(utility.Multiply(1,2));
        System.out.println(utility.Multiply(2, 4));

        bicycle bike = new bicycle(1,2);
        touringBike tBike= new touringBike(2,3);

        bike.print();
        tBike.print();

        // a = new mountainBike();
    }
}
