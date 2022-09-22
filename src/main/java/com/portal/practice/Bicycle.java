package com.portal.practice;

// base class or 'super class'
public class Bicycle {
    // the Bicycle class has two fields
    public int gear;
    public int speed;

    void print() {
        System.out.println("Parent class");
    }

    // bicycle class has one constructor
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement) {

        speed -= decrement;

        System.out.println("Brake applied, speed decreased");
    }

    public void speedUp(int increment) {

        speed += increment;

        System.out.println("accelerating, speed increased");
    }

    // toString() to print bicycle info
    public String toString() {
        return ("Current Gear : " + gear +
                "\n" + "Current Speed : " + speed);
    }

}
