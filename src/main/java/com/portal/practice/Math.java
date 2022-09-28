package com.portal.practice;
/**
 * The HelloWorld program implements methods
 * from Java Math class.
 *
 * @author  Vincent
 * @version 1.0
 * @since   2022-09-27
 */
public class Math {
    static int result;

    public static int addNum(int numA, int numB) {
        return result = numA + numB;

    }

    public static int subtract(int numA, int numB) {
        return result = numA + numB;
    }

    public static void main(String[] args) {
        System.out.println(addNum(2,3));

        Math obj = new Math();
        int sum = obj.addNum(10,20);

        obj.toString();

        System.out.println("sum of 10 and 20 is : " + sum);
    }
}
