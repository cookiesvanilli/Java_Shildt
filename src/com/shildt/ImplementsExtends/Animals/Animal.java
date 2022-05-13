package com.shildt.ImplementsExtends.Animals;

public class Animal implements Runnable {
    String name;

    public void iAmAnimal() {
        System.out.println(this);
    }

    @Override
    public String run() {
        return "I am running";
    }

    @Override
    public String walk() {
        return "WALK";
    }
}
