package org.example.anotheremployee;

import org.example.strings.oop_excercises_SDA.address.Address;
import org.example.strings.oop_excercises_SDA.department.Department;
import org.example.strings.oop_excercises_SDA.employee.Employee;

public class JavaDeveloper extends Employee {
    public JavaDeveloper() {
    }

    public JavaDeveloper(int id, String name, String surname, long pesel, String city, String street, int postcode, Department department) {
        super(id, name, surname, pesel, city, street, postcode, department, EmployeeRole.JAVA_DEVELOPER);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    @Override
    public long getPesel() {
        return super.getPesel();
    }

    @Override
    public void setPesel(long pesel) {
        super.setPesel(pesel);
    }

    @Override
    public Address getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(Address address) {
        super.setAddress(address);
    }


    public String toStrin() {
        return super.toString();
    }
}
