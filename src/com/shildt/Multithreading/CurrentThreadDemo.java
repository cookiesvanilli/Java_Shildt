package com.shildt.Multithreading;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        t.setName("My Thread");
        System.out.println("After changing the thread name" + t);

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);// приостановить свое выполнение на указанное количество миллисекунд (1сек = 1000 миллисекунд)
            }
        } catch (InterruptedException e) {
            System.out.println("the main execution thread is interrupted");
        }
    }
}
