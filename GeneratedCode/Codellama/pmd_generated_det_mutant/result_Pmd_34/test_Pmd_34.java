import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    public void testShowBug() {
        try {
            BuggyCode.showBug();
        } catch (Exception e) {
            assertTrue(e instanceof CustomException);
            assertEquals("This is a custom exception", e.getMessage());
        }
    }
}