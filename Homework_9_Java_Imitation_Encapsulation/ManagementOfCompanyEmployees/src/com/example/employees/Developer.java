package com.example.employees;

public class Developer extends Employee {

    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void performJob() {
        System.out.println(getName() + " is a developer.");
    }

    @Override
    public void describeRole() {
        System.out.println(getName() + " is writing code.");
    }

    @Override
    public void describeRole(String extraInfo) {
        System.out.println(getName() + " is a developer who creation of software that ensures the operation of computer systems and applications. " );
    }
}

