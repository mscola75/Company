package main.service;

import main.models.entities.Employee;
import java.util.*;

/**
 * Employee Service
 * @author Massimo Scola
 */
public class EmployeeService {

    private Set<Employee> employeeCollection = new HashSet<>();

    public EmployeeService() {
    }

    /**
     * @param employee  requires an employee object, whose salary will be raised
     * @param byPercent the percentage by which the salary will be increased
     */
    public boolean raiseSalary(Employee employee, double byPercent) {
        if (byPercent < 0) {
            //throw new IllegalArgumentException();
            return false;
        }

        try {
            double raise = employee.getSalary() * byPercent / 100;
            employee.setSalary(employee.getSalary() + raise);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Adds an employee. Checks if the employee has already been added
     * @param anEmployee
     * @return true or false if the employee was added
     */
    public boolean addEmployee(Employee anEmployee) {

        employeeCollection.add(anEmployee);
        System.out.println("Does the  collection contain the employee? " + employeeCollection.contains(anEmployee));

        if (employeeCollection.contains(anEmployee) == true) {
            System.out.println("Not added.");
            return false;
        }

        return true;
    }

    /**
     * @param anEmployee requires an employee
     * @return true if an employee was removed, false if it wasn't
     */
    public boolean removeEmployee(Employee anEmployee) {
        if (!employeeCollection.contains(anEmployee)) {
            return false;
        } else {
            for (Employee e : employeeCollection)
                if (e.equals(anEmployee)) {
                    employeeCollection.remove(e);
                    return true;
                }
        }
        return false;
    }

}
