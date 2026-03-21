import org.junit.Test;
import static org.junit.Assert.*;

public class StreamBugTest {

    private StreamBug streamBug = new StreamBug();

    @Test
    public void testShowBug() {
        try {
            streamBug.showBug();
            fail("Expected an exception"); // TRIGGER BUG: Intermediate Stream methods should not be left unused
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException);
        }
    }
}