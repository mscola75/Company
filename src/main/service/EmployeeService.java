package main.service;

import main.models.entities.Employee;

public class EmployeeService {
    public void raiseSalary(Employee employee, double byPercent) {
        if (byPercent < 0) {
            throw new IllegalArgumentException();
        }

        try {
            double raise = employee.getSalary() * byPercent / 100;
            employee.setSalary(employee.getSalary() + raise);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
