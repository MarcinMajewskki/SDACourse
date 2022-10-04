package org.example.threads;

public class SecondThread implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 150; i++) {
                System.out.println("Hi from the second thread ! " + i);
                Thread.sleep(60);
            }

        } catch (InterruptedException e) {
            System.out.println("I was interrupted !");
        }
    }
}
