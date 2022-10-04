package org.example.strings.oop_excercises_SDA.boxcopying;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box("First", 1);
        Box box2 = box1;

        Box box3 = box1.getCopyNewInstance();

        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());
        System.out.println(box3.hashCode());

        box1.setSize(3);
        box3.setName("Third");

        System.out.println(box1.toString());
        System.out.println(box2.toString());
        System.out.println(box3.toString());

    }
}
