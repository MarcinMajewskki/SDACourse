package org.example.strings.oop_excercises_SDA.Vehicles;

public class Main {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle(TypeOfFuel.MUSCLES,1,"Romet");
        Car car = new Car(TypeOfFuel.LPG, 4 , "Ford");
        Train train = new Train(TypeOfFuel.ELECTRIC, 200,"Bombardier");
//
//        bike.refuel("Diesel");
//        car.addPassengers(4);
//        car.refuel("LPG");


        train.addPassengers(30);
        System.out.println(train.getPassengersInside());
        train.addPassengers(20);
        System.out.println(train.getPassengersInside());
        train.removePassengers(60);
    }
}
