package main.Test;

import main.models.entities.*;
import main.models.utility.*;
import main.service.EmployeeFactory;
import main.service.EmployeeService;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class EmployeeServiceTest {
    private EmployeeService es;

    public EmployeeServiceTest() {
        es = new EmployeeService();
    }

    /**
     * Test 1: check if the salary incrase is accepted.
     */
    @org.junit.Test
    public void raiseSalary1() {
        // set fixtures
        Name name1 = new Name(Salutation.Mr, "Donald", "Duck",new Date(1920,06,06));
        Address address1 = new Address("Duck Street", "9000", "Disneyland", "USA");
        Employee employee1 = new Employee(name1,address1, 50000, 2017,1,1);


        if (es.raiseSalary(employee1,0)) {
            assert true: "Salary could be raised";
        }
        else {
            assert false: "Salary could not be raised.";
        }

    }

    /**
     * Test 2: check if a negative salary increase is accepted
     */
    @org.junit.Test
    public void raiseSalary2() {
        // set fixtures
        Name name1 = new Name(Salutation.Mr, "Donald", "Duck",new Date(1920,06,06));
        Address address1 = new Address("Duck Street", "9000", "Disneyland", "USA");
        Employee employee1 = new Employee(name1,address1, 50000, 2017,1,1);


        if (es.raiseSalary(employee1,-1)) {
            assert true: "Salary could be raised";
        }
        else {
            assert false: "Salary could not be raised.";
        }

    }

    /**
     * Test 1 for adding employee.
     * Test with an employee which has not already been added
     */
    @Test
    public void addEmployee1() {
        //set fixtures
        Name name1 = new Name(Salutation.Mr, "Donald", "Duck",new Date(1920,06,06));
        Address address1 = new Address("Duck Street", "9000", "Disneyland", "USA");
        Employee employee1 = new Employee(name1,address1,10000,2017,6,1);

        Name name2 = new Name(Salutation.Mr, "Micky", "Mouse", new Date(1923,07,06));
        Address address2 =  new Address("Mouse Street", "8000", "Disneyland", "USA");
        Employee employee2 = new Employee(name2,address2,50000,2017,6,2);

        Name name3 = new Name(Salutation.Mr, "Minnie", "Mouse", new Date(1930,06,06));
        Address address3 = new Address("Mouse Street", "6500", "Disneyland", "USA");
        Employee employee3 = new Employee(name3,address3,5000,2015,1,2);

        es.addEmployee(employee1);
        es.addEmployee(employee2);

        //test
        if (!es.addEmployee(employee3)) {
            assert false: "Employee was not added.";
        }
        else {
            assert false: "Employee was added.";
        }

    }

    /**
     * Test 2 for adding employee.
     * Test with an employee which has already been added

    @Test
    public void addEmployee2() {
        //set fixtures
        Name name1 = new Name(Salutation.Mr, "Donald", "Duck",new Date(1920,06,06));
        Address address1 = new Address("Duck Street", "9000", "Disneyland", "USA");
        Employee employee1 = new Employee(name1,address1,10000,2017,6,1);

        Name name2 = new Name(Salutation.Mr, "Micky", "Mouse", new Date(1923,07,06));
        Address address2 =  new Address("Mouse Street", "8000", "Disneyland", "USA");
        Employee employee2 = new Employee(name2,address2,50000,2017,6,2);

        Name name3 = new Name(Salutation.Mr, "Minnie", "Mouse", new Date(1930,06,06));
        Address address3 = new Address("Mouse Street", "6500", "Disneyland", "USA");
        Employee employee3 = new Employee(name3,address3,5000,2015,1,2);

        es.addEmployee(employee1);
        es.addEmployee(employee2);

        //test
        if (es.addEmployee(employee2)) {
            assert true: "Employee was added.";
        }
        else {
            assert false: "Employee was not added.";
        }

    }
     */
}