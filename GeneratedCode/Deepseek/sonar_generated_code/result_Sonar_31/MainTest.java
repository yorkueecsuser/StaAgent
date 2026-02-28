import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        try {
            Main.showBug();
            fail("Expected an IllegalArgumentException to be thrown"); // TRIGGER BUG: Regex lookahead assertions should not be contradictory
        } catch (Exception e) {
            // expected
        }
    }
}