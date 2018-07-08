package main.models.entities;

import main.models.utility.Address;

public class Manager extends Employee {
    String responsibleFor;

    public Manager(String name, double salary, int DOByear, int DOBmonth, int DOBday,
                   Address anAddress, String responsibleFor) {
        super(name, salary, DOByear, DOBmonth, DOBday, anAddress);
        this.responsibleFor = responsibleFor;
    }

    public String getResponsibleFor() {
        return responsibleFor;
    }

    public void setResponsibleFor(String responsibleFor) {
        this.responsibleFor = responsibleFor;
    }




}
