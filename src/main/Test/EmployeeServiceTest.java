package main.Test;

import main.models.entities.*;
import main.models.utility.*;
import main.service.EmployeeService;

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
}