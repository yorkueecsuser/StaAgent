import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        try {
            Main.showBug();
            fail("Expected an OutOfMemoryError"); // TRIGGER BUG: Loops should not be infinite
        } catch (OutOfMemoryError e) {
            // Expected exception occurred
        } catch (Exception e) {
            fail("Expected OutOfMemoryError but got: " + e.getMessage());
        }
    }
}