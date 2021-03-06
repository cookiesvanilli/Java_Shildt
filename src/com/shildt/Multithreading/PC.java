package com.shildt.Multithreading;

class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet)
        try {
            wait();

        } catch (InterruptedException e) {
            System.out.println("type exception InterruptedException intercepted");
        }
        System.out.println("Get: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet)
        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println("type exception InterruptedException intercepted");
        }
        this.n = n;
        valueSet = true;
        System.out.println("Send: " + n);
        notify();
    }
}

class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "producer").start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "consumer").start();
    }

    public void run() {
        while (true) {
            q.get();
        }
    }
}

public class PC {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("Press Ctrl + C");
    }
}
