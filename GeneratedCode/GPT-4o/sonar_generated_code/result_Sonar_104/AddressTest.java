import org.junit.Test;

// Mock classes to simulate HttpServletRequest and HttpSession
class HttpSession {
    public void setAttribute(String name, Object value) {
        // Mock implementation
    }
}

class HttpServletRequest {
    public HttpSession getSession() {
        return new HttpSession(); // Mock implementation
    }
}

// Original class
class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }
}

class SessionManager {
    // Method to demonstrate the bug
    public void showBug(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Address address = new Address("123 Main St", "Anytown");
        
        // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
        session.setAttribute("address", address); // Noncompliant; Address isn't serializable
    }
}

public class SessionManagerTest {

    @Test
    public void testShowBug() {
        HttpServletRequest request = new HttpServletRequest();
        SessionManager manager = new SessionManager();

        manager.showBug(request); // TRIGGER BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
    }
}