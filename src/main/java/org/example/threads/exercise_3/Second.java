package org.example.threads.exercise_3;

public class Second implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println("I'll be first - its me >'Second' thread <");
        }
        System.out.println("I've ended ! - its me >'Second' thread <");
    }
}
