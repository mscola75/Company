package main.models.entities;

import main.models.utility.Address;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;
    private Address anAddress;

    public Employee(String name, double salary, int hireYear, int hireMonth, int hireDay, Address anAddress) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(hireYear,hireMonth,hireDay);
        this.anAddress = anAddress;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {

        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public Address getAnAddress() {
        return anAddress;
    }

    public void setAnAddress(Address anAddress) {
        this.anAddress = anAddress;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n Salary: " + (int) salary + "\n Hire Date: " + hireDay;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
