package com.shildt.ImplementsExtends.Animals;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cat cat2 = new Cat();
        cat.iAmAnimal();
        dog.iAmAnimal();
        System.out.println(cat.run());
        System.out.println(dog.run());
        System.out.println(dog.walk());
        cat2.iCat();
        cat.name = "Barsik";
    }
}
