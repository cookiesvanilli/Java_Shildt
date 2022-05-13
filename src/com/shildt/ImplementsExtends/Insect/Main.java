package com.shildt.ImplementsExtends.Insect;

public class Main {
    public static void main(String[] args) {
        Bee bee = new Bee();
        bee.name = "Mini";
        System.out.println(bee.name);
        System.out.println(bee.fly());
        bee.iBee();
        bee.isBuzz();
    }
}
