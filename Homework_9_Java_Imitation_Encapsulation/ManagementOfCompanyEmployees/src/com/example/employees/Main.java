package com.example.employees;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Manager("Mateo", 35, 70000),
                new Developer("Den", 28, 50000),
                new Designer("Viki", 30, 30000)
        };

        for (Employee employee : employees) {
            employee.performJob();
            employee.describeRole();
            employee.describeRole("Extra info about the role.");
            System.out.println();
        }
    }
}

