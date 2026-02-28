import org.junit.Test;
import static org.junit.Assert.*;

public class StatusCodeBugExampleTest {

    @Test
    public void testShowBugWithException() {
        StatusCodeBugExample example = new StatusCodeBugExample();
        try {
            example.showBug(); // TRIGGER BUG: Set appropriate Status Codes on HTTP responses
            fail("Expected an exception to be thrown");
        } catch (IOException e) {
            assertEquals("Simulated exception", e.getCause().getMessage());
        }
    }
}