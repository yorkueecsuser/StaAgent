import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleBugTest {

    @Test
    public void testShowBugWithNonNullString() {
        ExampleBug example = new ExampleBug();
        assertTrue(example.showBug("ok")); // TRIGGER BUG: UnusedNullCheckInEquals
    }

    @Test
    public void testShowBugWithNullString() {
        ExampleBug example = new ExampleBug();
        assertFalse(example.showBug(null)); // TRIGGER BUG: UnusedNullCheckInEquals
    }
}