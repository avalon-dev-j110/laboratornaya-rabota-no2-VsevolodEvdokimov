package com.company;

public class Airplane extends Transport {
    public static TransportType type = TransportType.AIRPLANE;

    public Airplane(Text name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("fly");
    }

//  Более общая реализация, можно вынести в базовый класс. Но тогда он перестанет быть абстрактным. :)
//    @Override
//    protected void print() {
//        System.out.printf("%s: %s", type.toString(), name);
//    }

    @Override
    protected void print() {
        System.out.printf("Airplane: %s", name);
    }
}
