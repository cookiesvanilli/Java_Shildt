package com.shildt.Enumiration;

public class Enum2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Const Apple: ");

        Apple allaples[] = Apple.values();
        for (Apple a : allaples) {
            System.out.println(a);
        }
        System.out.println();

        ap = Apple.valueOf("Winesap");
        System.out.println("Variable ap contains " + ap);
    }
}
