package com.portal.practice;

public class mountainBike extends bicycle {
    // mountainBike subclass add one field
    int seatHeight;

    // mountainBike subClass has one constructor
    public mountainBike(int gear, int speed, int startHeight) {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info
    @Override public String toString() {

        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}
