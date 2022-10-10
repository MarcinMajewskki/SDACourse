package org.example.FileIO_Exercise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedInputReader fragment = new BufferedInputReader("files\\fragment.txt");

        System.out.println("=============================================================");
        System.out.println("Whole text as a string : ");
        System.out.println("=============================================================");

        System.out.println(fragment.getTextAsString());

        System.out.printf("\n \n \n=============================================================\n");
        System.out.println("Whole text as a element of ArrayList by line index : ");
        System.out.println("=============================================================");

        fragment.getTextAsStringArr().stream().forEach(System.out::println);

        System.out.println("\n \n \n=============================================================\n");
        System.out.println("Single line of text : ");
        System.out.println("=============================================================");

        System.out.println(fragment.getLine(2));


    }
}