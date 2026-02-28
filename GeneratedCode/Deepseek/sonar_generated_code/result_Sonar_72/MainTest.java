import org.junit.Test;
import java.util.HashMap;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testShowBug() {
        try {
            Main.showBug();
            fail("Expected an IllegalStateException to be thrown");
        } catch (IllegalStateException e) {
            // Expected
        }
        // TRIGGER BUG: Double Brace Initialization should not be used
    }
}