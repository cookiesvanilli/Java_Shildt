package com.shildt.Enumiration;

enum Apples {
    Jonathan(10),
    Golden(9),
    RedDel(12),
    Winesap(15),
    Cortland(8);

    private int price;

    Apples(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}


public class Enum3 {
    public static void main(String[] args) {
        Apples ap;

        System.out.println("A Winesap apple costs " + Apples.Winesap.getPrice() + " cents.\n");
        System.out.println("Prices for all varieties of apples: ");
        for (Apples a : Apples.values()) {
            System.out.println(a + " costs " + a.getPrice() + " cents.");
        }
    }
}
