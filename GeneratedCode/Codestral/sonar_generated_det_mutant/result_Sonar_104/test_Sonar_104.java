import org.junit.Test;
import static org.junit.Assert.*;
import java.io.NotSerializableException;

// Address class without Serializable interface to trigger NotSerializableException
class Address {
    //...
}

class SessionManagerTest {
    @Test
    public void testShowBug() {
        SessionManager sessionManager = new SessionManager();
        try {
            sessionManager.showBug(); // TRIGGER BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
            fail("Expected NotSerializableException to be thrown");
        } catch (NotSerializableException e) {
            // We expect this exception to be thrown, so we do nothing here.
        }
    }
}