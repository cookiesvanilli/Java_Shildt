package com.shildt.inheritance;

//В терминологии Java наследуемый класс называется суперклассом,
// а наследующий класс - подклассом

//create superclass
class A {
    int i, j;

    void showij() {
        System.out.println("i & j: " + i + " " + j);
    }
}

// create a subclass by extending class A
class B extends A {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i + j + k));
    }
}

public class SimpleInheritance {
    public static void main(String args[]) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("superOb: ");
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("subOb: ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("Summa i, j, k in subOb: ");
        subOb.sum();
    }
}
