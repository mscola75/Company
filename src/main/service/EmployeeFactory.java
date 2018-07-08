package main.service;

import main.models.entities.Employee;
import main.models.utility.Address;
import main.models.utility.Name;

public class EmployeeFactory {
    public static Employee createJuniorEmployee(Name aName, int hireYear, int hireMonth,
                                                int hireDay) {
        return new Employee(aName, 50000, hireYear, hireMonth, hireDay);
    }
}
