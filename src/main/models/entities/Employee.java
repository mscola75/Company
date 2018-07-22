package main.models.entities;

import main.models.utility.Name;

import java.time.LocalDate;

public class Employee {
    private Name name;
    private double salary;
    private LocalDate hireDay;


    public Employee(Name name, double salary, int hireYear, int hireMonth, int hireDay) {
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


}
