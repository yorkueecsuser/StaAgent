import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyControllerTest {

    @Test
    public void testShowBug() throws Exception {
        BuggyController controller = new BuggyController();
        String response = controller.showBug(); // TRIGGER BUG: Set appropriate Status Codes on HTTP responses
        assertTrue(response.startsWith("Operation failed:")); // The method should indicate failure and set appropriate status code
    }
}