package main;

import main.entities.Employee;
import main.service.EmployeeService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        //create three employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Donald Duck", 60000, 1920, 5,1);
        staff[1] = new Employee("Mickey Mouse", 7000, 1921, 6,2);
        staff[2] = new Employee("Daisy Duck", 4500, 1930, 5,1);

        //print all employees
        for (Employee e: staff) {
            System.out.println("Name:" + e.getName() + " salary: " + e.getSalary());
        }

        EmployeeService employeeService = new EmployeeService();


        for (Employee e: staff) {
            employeeService.raiseSalary(e, 100);
        }

        //print all employees
        for (Employee e: staff) {
            System.out.println("Name:" + e.getName() + " salary: " + e.getSalary());
        }
    }
}
