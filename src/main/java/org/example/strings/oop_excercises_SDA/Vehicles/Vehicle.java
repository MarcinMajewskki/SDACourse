package org.example.strings.oop_excercises_SDA.Vehicles;

import java.util.SortedMap;

public class Vehicle {
    public TypeOfFuel poweredBy;
    public int seats;
    public String name;
    public int passengersInside = 0;

    public Vehicle(TypeOfFuel poweredBy, int seats, String name) {
        this.poweredBy = poweredBy;
        this.seats = seats;
        this.name = name;
    }

    public void refuel(TypeOfFuel fuelType){
            if (fuelType.equals(poweredBy)){
                System.out.println("Fueling ");
            }
            else {
                System.out.println("Wrong type of fuel !");
            }
        }
    public void addPassengers(int amount){
        if (seats > amount && (passengersInside + amount) <= seats){
            System.out.println("Passengers added!");
            passengersInside += amount;
        }
        else {
            System.out.println("There's no enough seats !");
        }
    }
    public void removePassengers(int amount){
        if (passengersInside == 0){
            System.out.println("Vehicle is empty");
        }
        if (amount > seats){
            System.out.println("Error, its impossible to remove that much passengers because there's no that much seats!");
        }
        if (passengersInside < amount){
            System.out.println("There's less than " + amount + " passengers");
        }
        else {
            passengersInside -= amount;
        }
    }

    public TypeOfFuel getPoweredBy() {
        return poweredBy;
    }

    public void setPoweredBy(TypeOfFuel poweredBy) {
        this.poweredBy = poweredBy;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengersInside() {
        return passengersInside;
    }

    public void setPassengersInside(int passengersInside) {
        this.passengersInside = passengersInside;
    }
}
