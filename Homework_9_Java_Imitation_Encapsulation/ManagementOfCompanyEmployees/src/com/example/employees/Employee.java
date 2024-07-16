package com.example.employees;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("Employee " + name + " is working at " + age + " years old.");
    }

    public void takeBreak(){
        System.out.println("Employee " + name + " is taking a break.");
    }

    public void performJob(){
        System.out.println("Employee " + name + " is performing job.");
    }

    public void describeRole(){
        System.out.println("Employee " + name + " is describing role");
    }

    public void  describeRole(String extraInfo){
        System.out.println("Employee " + name + " is describing role " +extraInfo);
    }


}
