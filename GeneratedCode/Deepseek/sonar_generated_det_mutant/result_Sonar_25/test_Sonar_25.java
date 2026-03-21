import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        try {
            Main.showBug(); // TRIGGER BUG: Reflection should not be used to increase accessibility of record's fields
            fail("Expected an IllegalAccessException to be thrown"); // If no exception is thrown, the test fails
        } catch (IllegalAccessException e) {
            // Expected exception
        } catch (Exception e) {
            fail("Unexpected exception thrown: " + e.toString()); // If any other exception is thrown, the test fails
        }
    }
}