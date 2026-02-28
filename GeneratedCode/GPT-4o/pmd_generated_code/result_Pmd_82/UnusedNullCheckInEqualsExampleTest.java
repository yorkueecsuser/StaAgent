import org.junit.Test;
import static org.junit.Assert.*;

public class UnusedNullCheckInEqualsExampleTest {

    @Test
    public void testShowBug() {
        UnusedNullCheckInEqualsExample example = new UnusedNullCheckInEqualsExample();

        // This test case should pass
        assertTrue(example.showBug("ok"));

        // This test case should fail and trigger the bug
        assertFalse(example.showBug(null)); // TRIGGER BUG: UnusedNullCheckInEquals
    }
}