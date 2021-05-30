package belhard.java28;

import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private Address address;

    public Person(String firstName, String lastName, Address address) {
        if (firstName == null || lastName == null || address == null) {
            System.out.println (new NullFieldException ( "Задано значение null" ));
        } else{
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
        }
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            System.out.println (new NullFieldException ( "Задано значение null firstName" ));
        } else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            System.out.println (new NullFieldException ( "Задано значение null lastName" ));
        } else {
            this.lastName = lastName;
        }
    }

    public void setAddress(Address address) {
        if (address == null) {
            System.out.println (new NullFieldException ( "Задано значение null address" ));
        } else {
            this.address = address;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return (address != null) ? "Имя: " + this.firstName + " Фамилия: " + this.lastName + " Адрес: " + this.address.toString () : "Имя: " + this.firstName + " Фамилия: " + this.lastName + " Адрес: null";
    }
}
