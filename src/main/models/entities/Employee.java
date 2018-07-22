package main.models.entities;

import main.models.utility.*;

import java.time.LocalDate;

public class Employee {
    private Name name;
    private double salary;
    private LocalDate hireDay;
    private Address address;


    public Employee(Name name, Address anAddress, double salary, int hireYear, int hireMonth, int hireDay) {
        this.address = anAddress;
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(hireYear,hireMonth,hireDay);
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

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
