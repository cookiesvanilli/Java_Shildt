package com.shildt.inheritance;


//create superclass
class A1 {
    int i;
    private int j;

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

// create a subclass by extending class A1
class B1 extends A1 {
    int total;

    void sum() {
        total = i;//+ j; //error - java: j has private access in com.shildt.inheritance.A
    }
}

public class Access {
    public static void main(String args[]) {
        B1 subOb = new B1();
        subOb.setij(10, 12);
        subOb.sum();
        System.out.println("Summ: " + subOb.total);
    }
}
