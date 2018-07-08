package main.entities;

public class Manager extends Employee {
    String responsibleFor;

    public Manager(String name, double salary, int DOByear, int DOBmonth, int DOBday, Address anAddress) {
        super(name, salary, DOByear, DOBmonth, DOBday, anAddress);
    }

    public String getResponsibleFor() {
        return responsibleFor;
    }

    public void setResponsibleFor(String responsibleFor) {
        this.responsibleFor = responsibleFor;
    }


    public Manager(String name, double salary, int year, int month, int day, String responsibleFor) {
        super(name, salary, year, month, day);

        this.responsibleFor = responsibleFor;
    }


}
