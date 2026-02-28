import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidEnumAsIdentifierTest {
    @Test
    public void testShowBug() {
        AvoidEnumAsIdentifier demo = new AvoidEnumAsIdentifier();
        assertEquals("foo", demo.showBug()); // TRIGGER BUG: AvoidEnumAsIdentifier (This line will fail the test due to the bug in the Java code)
    }
}