import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    Main main = new Main();

    @Test
    public void testBoxingAndUnboxing() {
        // TRIGGER BUG: Unnecessary boxing and unboxing should be avoided
        try {
            main.showBug();
            fail("Expected an AssertionError to be thrown"); // FAILS HERE
        } catch (AssertionError e) {
            assertEquals("Expected to fail", e.getMessage());
        }
    }
}