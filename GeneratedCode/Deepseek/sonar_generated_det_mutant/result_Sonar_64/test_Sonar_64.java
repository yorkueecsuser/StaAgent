import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testShowBug() {
        try {
            Main.showBug();
            fail("Expected an IllegalArgumentException to be thrown"); // TRIGGER BUG: Exceptions should not be created without being thrown
        } catch (IllegalArgumentException ignored) {
        }
    }
}