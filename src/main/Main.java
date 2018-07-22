package main;

import main.service.*;
import main.models.entities.*;
import main.models.utility.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //create three employee objects
        Employee[] staff = new Employee[3];

        Name name1 = new Name(Salutation.Mr, "Donald", "Duck",new Date(1920,06,06));
        Address address1 = new Address("Duck Street", "9000", "Disneyland", "USA");

        Name name2 = new Name(Salutation.Mr, "Micky", "Mouse", new Date(1923,07,06));
        Address address2 =  new Address("Mouse Street", "8000", "Disneyland", "USA");

        Name name3 = new Name(Salutation.Mr, "Minnie", "Mouse", new Date(1930,06,06));
        Address address3 = new Address("Mouse Street", "6500", "Disneyland", "USA");

        staff[0] = new Employee(name1, address1,1000, 2017,6,8);
        staff[1] = EmployeeFactory.createJuniorEmployee(name2, address2,2000, 5, 8);
        staff[2] = EmployeeFactory.createJuniorEmployee(name3, address3,2010, 4, 9);

        //print all employees
        for (Employee e : staff) {
            System.out.println("Name:" + e.getName() + " salary: " + e.getSalary());
        }

        EmployeeService employeeService = new EmployeeService();

        for (Employee e : staff) {
            employeeService.raiseSalary(e, 100);
        }

        //print all employees
        for (Employee e : staff) {
            System.out.println("Name:" + e.getName() + " salary: " + e.getSalary());
        }

        //sort
        Arrays.sort(staff, (one, two) ->
                (int) (one.getName().getFirstName().length() -  two.getName().getFirstName().length()));

        System.out.println();
        for (Employee e : staff) {
            System.out.println(e);
        }
    }
}
