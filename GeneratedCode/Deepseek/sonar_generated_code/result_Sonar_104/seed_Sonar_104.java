import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.Serializable;

class Address implements Serializable {
    //...
}

class Main {
    public static void main(String[] args) {
        // Assuming this is an instance of HttpServletRequest
        HttpServletRequest request = null;
        HttpSession session = request.getSession();
        session.setAttribute("address", new Address());  // Noncompliant; Address isn't serializable
        // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
    }

    public Object showBug() {
        // Assuming this is an instance of HttpServletRequest
        HttpServletRequest request = null;
        HttpSession session = request.getSession();
        return session.getAttribute("address");
    }
}