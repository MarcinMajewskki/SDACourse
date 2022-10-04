package org.example.threads.exercise_3;

public class Main {
    public static void main(String[] args) {

        Thread first = new Thread(new First());
        Thread second = new Thread(new Second());

        first.start();
        second.start();


    }
}
