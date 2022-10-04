package org.example.threads;

public class Main {
    public static void main(String[] args) {
        Thread first = new Thread(new FirstThread());
        Thread second = new Thread(new SecondThread());

        first.start();
        try {
            first.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        second.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) { }

        second.interrupt();
    }
}
