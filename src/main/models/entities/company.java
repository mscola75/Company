package main.models.entities;

import main.models.utility.Address;

import java.util.*;

public class company {

    String companyName;
    HashSet<String> allEmployees;
    Address address;
    Employee CEO;


    public company(String companyName, HashSet<String> allEmployees, Address address, Employee CEO) {
        this.companyName = companyName;
        this.allEmployees = allEmployees;
        this.address = address;
        this.CEO = CEO;
    }



    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public HashSet<String> getAllEmployees() {
        return allEmployees;
    }

    public void setAllEmployees(HashSet<String> allEmployees) {
        this.allEmployees = allEmployees;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee getCEO() {
        return CEO;
    }

    public void setCEO(Employee CEO) {
        this.CEO = CEO;
    }

    @Override
    public String toString() {
        return companyName + " " + address + " " + "CEO is:" + CEO;
    }
}
