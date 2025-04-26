class Address {
    String city;
    String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }
}

class Employee implements Cloneable {
    String name;
    Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow clone
    public Object clone() throws CloneNotSupportedException {
        return super.clone();  // default shallow copy
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("Satna", "INDIA");
        Employee emp1 = new Employee("John", addr);
        Employee emp2 = (Employee) emp1.clone();

        // Changing emp2's address will affect emp1 as well in shallow copy
        emp2.address.city = "BHOPAL";

        System.out.println("emp1 address city: " + emp1.address.city);
        System.out.println("emp2 address city: " + emp2.address.city);
    }
}
