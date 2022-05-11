package com.shildt.inheritance;

class A2 {
    int i, j;

    A2(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i+j: " + i + " " + j);
    }
}

class B2 extends A2 {
    int k;

    B2(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}

public class Override {
    public static void main(String args[]) {
        B2 subOb = new B2(1, 2, 6);
        subOb.show("k = ");
        subOb.show();
    }
}
