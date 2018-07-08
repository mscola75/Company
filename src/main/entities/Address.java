package main.entities;

public class Address implements Comparable<Address> {
    private String street;
    private String postalCode;
    private String city;
    private String country;

    public Address(String aStreet, String aPostalCode, String aCity, String aCountry) {
        this.street = aStreet;
        this.postalCode = aPostalCode;
        this.city = aCity;
        this.country = aCountry;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public int compareTo(Address anAddress) {
        if (street.compareTo(anAddress.street) < 0)
            return -1;
        if (street.compareTo(anAddress.street) > 0)
            return 1;
        if (postalCode.compareTo(anAddress.postalCode) < 0)
            return -1;
        if (postalCode.compareTo(anAddress.postalCode) > 0)
            return 1;
        if (city.compareTo(anAddress.city) < 0)
            return -1;
        if (city.compareTo(anAddress.city) > 0)
            return 1;
        if (country.compareTo(anAddress.country) < 0)
            return -1;
        if (country.compareTo(anAddress.country) > 0)
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return street + " " + postalCode + " " + city + " " + country;
    }
}
