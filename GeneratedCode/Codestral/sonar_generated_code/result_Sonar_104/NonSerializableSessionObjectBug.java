import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

class NonSerializableSessionObjectBug {
    private class Address {
        // Noncompliant: Address isn't serializable // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
    }

    public void showBug(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("address", new Address()); // Bug: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
    }
}