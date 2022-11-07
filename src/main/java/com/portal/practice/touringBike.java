package com.portal.practice;

public class touringBike extends bicycle{
    private int serialNumber;

    public touringBike(int gear, int speed) {
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
