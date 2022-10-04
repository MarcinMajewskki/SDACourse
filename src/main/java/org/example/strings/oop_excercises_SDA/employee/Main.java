package org.example.strings.oop_excercises_SDA.employee;

import org.example.anotheremployee.EmployeeRole;
import org.example.anotheremployee.JavaDeveloper;
import org.example.strings.oop_excercises_SDA.address.Address;
import org.example.strings.oop_excercises_SDA.department.Department;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setAddress(new Address("Sosnowa","Kraków",30912));
        System.out.println(employee);


        Employee employee1 = new Employee(1,"Marcin","Majewski", 999999999999L,"Krakow",
                "Lipska",32721, Department.HR, EmployeeRole.JAVA_DEVELOPER);
        System.out.println(employee1);

        Employee employee2 = new Employee(2,"Adam", "Małysz", 981981981L,"Zakopane",
                "Krupowki",33333,Department.HEAD,EmployeeRole.TEAM_LEADER);

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);

        Company company = new Company(1,"IBM",new Address("W","W",30303),employees);
        Employee developer = new JavaDeveloper(1,"A","B",0L,"a","b",0,Department.HR);
        System.out.println(company);


    }
}
