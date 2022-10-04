package org.example.threads.exercise_2;

import javax.swing.*;

public class Timer implements Runnable{
    private boolean isWorking = true;
    private int time = 0 ;

    @Override
    public void run() {
        while (isWorking) {
            System.out.println("Program is working for " + time++ + "s now " );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }
}
