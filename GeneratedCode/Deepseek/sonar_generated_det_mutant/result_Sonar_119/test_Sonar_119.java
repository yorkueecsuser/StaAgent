import org.junit.Test;
import static org.junit.Assert.*;

public class AtomicBugExampleTest {
    @Test
    // TRIGGER BUG: ".equals()" should not be used to test the values of "Atomic" classes
    public void testBug() {
        AtomicBugExample bugExample = new AtomicBugExample();
        assertTrue(bugExample.showBug()); // This line triggers the bug
    }

    @Test
    // TRIGGER BUG: ".equals()" should not be used to test the values of "Atomic" classes
    public void testBug2() {
        AtomicBugExample bugExample = new AtomicBugExample();
        assertTrue(bugExample.showBug2()); // This line triggers the bug
    }
}