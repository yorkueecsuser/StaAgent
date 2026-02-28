import org.junit.Test;
import static org.junit.Assert.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.Serializable;

public class MainTest {
    class Address implements Serializable {
        //...
    }

    @Test
    public void testShowBug() {
        Main main = new Main();
        // Assuming this is an instance of HttpServletRequest
        HttpServletRequest request = null;
        HttpSession session = request.getSession();
        session.setAttribute("address", new Address());
        // TRIGGER BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
        assertNull("Non-serializable objects should not be stored in 'javax.servlet.http.HttpSession' instances", main.showBug());
    }
}