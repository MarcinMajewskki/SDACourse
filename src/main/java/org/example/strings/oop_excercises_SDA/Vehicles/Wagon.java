package org.example.strings.oop_excercises_SDA.Vehicles;

public class Wagon extends Train{
    public Wagon(TypeOfFuel poweredBy, int seats, String name) {
        super(TypeOfFuel.WITHOUT, seats, name);
    }
}
