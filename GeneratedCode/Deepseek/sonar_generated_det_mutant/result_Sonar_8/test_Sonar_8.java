import org.junit.Test;
import static org.junit.Assert.*;

public class HttpStatusCodeBugTest {
    HttpStatusCodeBug buggyCode = new HttpStatusCodeBug();

    @Test
    public void testShowBug() {
        int statusCode = buggyCode.showBug();
        // Test should fail because it is expected to return 500 for exception and 200 for success
        // TRIGGER BUG: Set appropriate Status Codes on HTTP responses
        assertEquals("Status code should be 500", 500, statusCode);
    }
}