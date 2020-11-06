package com.company;

public abstract class Transport implements ITransport {
    protected Text name;

    private Transport() {}
    protected Transport(Text name) {
        this.name = name;
    }

    abstract protected void print();


    public static void main(String[] args) {
        var transports = new Transport[] {
            new Airplane(new Text("Boeing-737")),
            new Train(new Text("Red Arrow")),
            new Car(new Text("Aston Martin")),
        };

        System.out.println("Transport:print() demo");
        for (var t : transports){
            t.print();
            System.out.println();
        }
        System.out.println();

        System.out.println("ITransport:move() demo");
        var itranstports = (ITransport[])transports;
        for (var it : transports)
            it.move();
        System.out.println();
    }
}
