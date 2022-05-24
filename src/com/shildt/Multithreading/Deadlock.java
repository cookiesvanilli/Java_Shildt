package com.shildt.Multithreading;

class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered the method A.foo()");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Class A interrupted");
        }
        System.out.println(name + " tries to call the method B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("In method A.last()");
    }
}

class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered the method B.bar()");
        try {
            Thread.sleep(1000);

        } catch (Exception e) {
            System.out.println("Class B interrupted");
        }
        System.out.println(name + " tries to call the method A.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("In method A.last()");
    }
}

public class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("Main thread");
        Thread t = new Thread(this, "Rival thread"); //соперничающий поток
        t.start();
        a.foo(b);
        System.out.println("Back in main thread");
    }

    public void run() {
        b.bar(a);
        System.out.println("Back in other thread");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
