package main.service;

import main.entities.Employee;

public class EmployeeService {
    public void raiseSalary(Employee employee, double byPercent) {
        double raise = employee.getSalary() * byPercent / 100;
        employee.setSalary(employee.getSalary() + raise);
    }
}
