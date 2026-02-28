import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        try {
            Main.showBug(); // TRIGGER BUG: Calls to methods should not trigger an exception
        } catch (IllegalArgumentException e) {
            // Expected to fail, but it passed
            fail("This should have thrown an IllegalArgumentException");
        } catch (Exception e) {
            // Expected to fail with IllegalArgumentException, but it failed with another exception
            fail("This should have thrown an IllegalArgumentException, but it threw a " + e.getClass().getName());
        }
    }
}