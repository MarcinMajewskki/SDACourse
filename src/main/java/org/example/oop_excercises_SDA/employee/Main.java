package org.example.oop_excercises_SDA.employee;

import org.example.oop_excercises_SDA.address.Address;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setAddress(new Address("Sosnowa","Kraków",30912));
        System.out.println(employee.toString());
        Employee employee1 = new Employee(1,"Marcin","Majewski", 999999999999L,"Krakow","Lipska",32721);
        System.out.println(employee1.toString());

    }
}
