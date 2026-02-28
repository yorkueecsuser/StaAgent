import org.junit.Test;
import static org.junit.Assert.*;

public class OptionalBugExampleTest {

    @Test
    public void testShowBugWithNonNullInput() {
        OptionalBugExample example = new OptionalBugExample();
        String result = example.showBug("Hello, World!"); // TRIGGER BUG: OptionalOfRedundantMethod
        assertNotNull(result);
        assertEquals("Hello, World!", result);
    }

    @Test
    public void testShowBugWithNullInput() {
        OptionalBugExample example = new OptionalBugExample();
        String result = example.showBug(null); // This will throw NullPointerException, but we are testing the redundant isPresent call
        assertNull(result);
    }
}