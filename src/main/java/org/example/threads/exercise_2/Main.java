package org.example.threads.exercise_2;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Thread timerOne = new Thread(timer);

        timerOne.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        timer.setWorking(false);

    }
}
