package org.example.threads;

public class FirstThread implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 150; i++) {
                System.out.println("Hi im running on first thread ! " + i);
                Thread.sleep(20);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Interrupted!");
        }
    }
}
