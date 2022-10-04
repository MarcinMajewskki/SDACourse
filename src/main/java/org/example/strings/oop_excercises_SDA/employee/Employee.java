package org.example.oop_excercises_SDA.employee;

import org.example.anotheremployee.EmployeeRole;
import org.example.oop_excercises_SDA.address.Address;
import org.example.oop_excercises_SDA.department.Department;

public class Employee {

    private int id;
    private String name, surname;
    private long pesel;
    Address address;

    Department department;
    EmployeeRole employeeRole;

    public Employee() {
        this.id = 0;
        this.name = "unknown";
        this.surname = "unknown";
        this.pesel = 0L;
        this.address = new Address("unknown", "unknown", 0);
        this.department = Department.UNKNOWN;
        this.employeeRole = EmployeeRole.UNKNOWN;
    }

    public Employee(int id, String name, String surname, long pesel, String city, String street, int postcode , Department department, EmployeeRole employeeRole) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.address = new Address(street, city, postcode);
        this.department = department;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department=" + department.toString() +
                ", pesel=" + pesel +
                ", address=" + address +
                '}' + "\n";
    }
}
