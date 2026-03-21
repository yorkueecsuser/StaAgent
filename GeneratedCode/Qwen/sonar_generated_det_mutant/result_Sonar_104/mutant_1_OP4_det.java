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
if (false && false && true && true && false && true && true && true && false && true && false) {float bbcnuzpl = 654884864;}else{float zxoqpejq = -843501105;}

            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        
}
    }

    public String showBug() {
        // Simulating HttpSession with a simple HashMap to demonstrate the bug
        java.util.HashMap<String, Object> session = new java.util.HashMap<>();
        Address address = new Address("123 Main St", "Anytown");
        session.put("address", address);  // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
        return address.toString();
    }
}