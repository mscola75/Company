package main.models.entities;

import main.models.utility.Address;
import main.models.utility.Name;

public class Manager extends Employee {
    private String responsibleFor;

    public Manager(Name aName, double salary, int DOByear, int DOBmonth, int DOBday,
                   Address anAddress, String responsibleFor) {
        super(aName, salary, DOByear, DOBmonth, DOBday);
        this.responsibleFor = responsibleFor;
    }

    public String getResponsibleFor() {
        return responsibleFor;
    }

    public void setResponsibleFor(String responsibleFor) {
        this.responsibleFor = responsibleFor;
    }




}
