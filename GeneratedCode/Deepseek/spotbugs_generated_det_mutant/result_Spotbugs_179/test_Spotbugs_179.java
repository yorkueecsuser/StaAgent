import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        Main main = new Main();
        assertEquals(2, main.showBug().size()); // Expected size of the list is 2, but it is 1 after the faulty call.
        // TRIGGER BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)
    }
}