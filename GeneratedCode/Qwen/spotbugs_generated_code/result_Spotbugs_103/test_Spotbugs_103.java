import org.junit.Test;
import static org.junit.Assert.*;

public class InstanceOfBugExampleTest {

    @Test
    public void testShowBugWithString() {
        InstanceOfBugExample example = new InstanceOfBugExample();
        assertEquals("Object is a String: Hello, World!", example.showBug("Hello, World!")); // TRIGGER BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
    }

    @Test
    public void testShowBugWithNonString() {
        InstanceOfBugExample example = new InstanceOfBugExample();
        assertEquals("Object is not a String", example.showBug(123)); // This test will pass and does not trigger the bug
    }
}