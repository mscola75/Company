package main.models.entities;

import main.models.utility.Address;
import main.models.utility.Name;

public class Manager extends Employee {
    private String responsibleFor;

    public Manager(Name aName, Address anAddress, double salary, int DOByear, int DOBmonth, int DOBday,
                   String responsibleFor) {
        super(aName, anAddress, salary, DOByear, DOBmonth, DOBday);
        this.responsibleFor = responsibleFor;
    }

    public String getResponsibleFor() {
        return responsibleFor;
    }

    public void setResponsibleFor(String responsibleFor) {
        this.responsibleFor = responsibleFor;
    }




}
