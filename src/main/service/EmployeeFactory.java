package main.service;

import main.models.entities.Employee;
import main.models.utility.*;


public class EmployeeFactory {
    public static Employee createJuniorEmployee(Name aName, Address anAddress, int hireYear, int hireMonth,
                                                int hireDay) {
        return new Employee(aName, anAddress,50000, hireYear, hireMonth, hireDay);
    }
}
