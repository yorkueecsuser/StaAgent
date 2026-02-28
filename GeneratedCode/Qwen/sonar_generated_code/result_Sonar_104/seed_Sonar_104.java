import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

class SessionBugExample extends HttpServlet {

    // Non-serializable class
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

    public String showBug(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Address address = new Address("123 Main St", "Anytown");
        session.setAttribute("address", address);  // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
        return address.toString();
    }
}