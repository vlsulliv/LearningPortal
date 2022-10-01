package com.portal.inheritance;

import com.portal.inheritance.Bicycle;

public class TouringBike extends Bicycle {
    private int serialNumber;

    public TouringBike(int gear, int speed) {
        super(gear, speed);
    }

    @Override
    void print() {
        super.print();
        System.out.println("subclass touringBike");
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}
