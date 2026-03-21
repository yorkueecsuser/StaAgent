import java.io.Serializable;

class SessionBugExample {

    class Address {
        private String street;
        private String city;

        public Address(String street, String city) {
            this.street = street;
            this.city = city;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }
public String showBug() {
    java.util.HashMap < String , Object > session = new java.util.HashMap < >();
    Address address = new Address("123 Main St" , "Anytown");
    address = new Address("123 Main St" , "Anytown");
    session.put("address" , address);
    return address.toString();
}
}