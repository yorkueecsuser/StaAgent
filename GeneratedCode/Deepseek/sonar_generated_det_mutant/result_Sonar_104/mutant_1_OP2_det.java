import java.io.Serializable;

class Address implements Serializable {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address() { }

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // Compliant solution
public void showBug() {
    Address address = new Address("123 Main St" , "Anytown" , "Anystate" , "12345");
    address = new Address("123 Main St" , "Anytown" , "Anystate" , "12345");
}
}