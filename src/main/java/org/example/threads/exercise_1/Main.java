package org.example.threads.exercise_1;

public class Main extends Thread {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Ta wiadomosc zostala wypisana z klasy anonimowej i z mojego watku");
            }
        });

        thread.start();

    }
}
