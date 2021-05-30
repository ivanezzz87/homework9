package belhard.java28;

import java.io.Serializable;

public class Address implements Serializable {
    private String city;
    private String street;
    private Integer house;

    public Address(String city, String street, Integer house) {
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(Integer house) {
        this.house = house;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public Integer getHouse() {
        return house;
    }

    @Override
    public String toString() {
        return city + ", " + street + ", " + String.valueOf ( house );
    }
}
