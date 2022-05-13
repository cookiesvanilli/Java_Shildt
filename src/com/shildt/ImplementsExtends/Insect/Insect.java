package com.shildt.ImplementsExtends.Insect;

public class Insect implements Flying {
    String name;
    String species;

    public void isBuzz() {
        System.out.println("Buzzz");
    }

    public void isFight() {
        System.out.println("Kick");
    }

    @Override
    public String go() {
        return "i am go";
    }

    @Override
    public String fly() {
        return "i am flying";
    }
}
