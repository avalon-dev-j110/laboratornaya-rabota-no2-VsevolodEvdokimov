package com.company;

public class Train  extends Transport {
    public static TransportType type = TransportType.TRAIN;

    public Train(Text name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("choo-choo");
    }

    @Override
    protected void print() {
        System.out.printf("Train: %s", name);
    }
}
