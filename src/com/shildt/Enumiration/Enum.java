package com.shildt.Enumiration;

enum Apple {
    Jonathan, Golden, RedDel, Winesap, Cortland
}


public class Enum {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;

        System.out.println("ap: " + ap);
        System.out.println();

        ap = Apple.Golden;

        if (ap == Apple.Golden) {
            System.out.println("Variable ap contains GoldenDel.\n");
        }
        switch (ap) {
            case Jonathan:
                System.out.println("Variety Jonathan red");
                break;
            case Golden:
                System.out.println("Variety Golden yellow");
                break;
            case RedDel:
                System.out.println("Variety RedDel red");
                break;
            case Winesap:
                System.out.println("Variety Winesap red");
                break;
            case Cortland:
                System.out.println("Variety Cortland red");
                break;
        }
    }
}
