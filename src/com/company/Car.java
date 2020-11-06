package com.company;

public class Car  extends Transport {
    public static TransportType type = TransportType.CAR;

    public Car(Text name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("drive");
    }

    @Override
    protected void print() {
        System.out.printf("Car: %s", name);
    }
}
