import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    Main example = new Main();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        int val = example.showBug();
        assertNotEquals(1, val);  // The expected value is 1 but the actual value is not 1, triggering the bug
    }
}