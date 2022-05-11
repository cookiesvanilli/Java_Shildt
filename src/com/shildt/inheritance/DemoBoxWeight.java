package com.shildt.inheritance;

class Box {
    private double width;
    private double height;
    private double depth;

    //клон объекта
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор, применяемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //конструктор, применяемый в отсутсвие размеров
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    //Cube
    Box(double len) {
        width = height = depth = len;
    }

    //V
    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight; //Вес параллелепипеда


    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len,
              double m) {
        super(len);
        weight = m;
    }
}

class Shipment extends BoxWeight {
    double cost;

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }

}

class DemoShipment {
    public static void main(String args[]) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        vol = shipment1.volume();

        System.out.println("V shipment1 = " + vol);
        System.out.println("Weight shipment1 = " + shipment1.weight);

        System.out.println("Cost: $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();

        System.out.println("V shipment2 = " + vol);
        System.out.println("Weight shipment2 = " + shipment2.weight);

        System.out.println("Cost: $" + shipment2.cost);
    }
}
