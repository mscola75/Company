package main.models.utility;

import java.util.Date;

public class Name implements Comparable<Name> {

    Salutation salutation;
    String firstName;
    String lastName;
    Date DOB;
    Address address;

    public Name(Salutation salutation, String aFirstName, String aLastName, Date aDOB, Address anAddress) {
        this.salutation = salutation;
        this.firstName = aFirstName;
        this.lastName = aLastName;
        this.DOB = aDOB;
        this.address = anAddress;
    }

    public Salutation getSalutation() {
        return salutation;
    }

    public void setSalutation(Salutation salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public int compareTo(Name aName) {
        if (firstName.compareTo(aName.firstName) < 0)
            return -1;
        if (firstName.compareTo(aName.firstName) > 0)
            return 1;
        if (lastName.compareTo(aName.lastName) < 0)
            return -1;
        if (lastName.compareTo(aName.lastName) > 0)
            return 1;
        if (salutation.compareTo(aName.salutation) < 0)
            return -1;
        if (salutation.compareTo(aName.salutation) > 0)
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return salutation + firstName + " " + lastName + " " + DOB + " " + address;
    }
}
