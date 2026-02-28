import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidAssertAsIdentifierBugTest {
    @Test
    public void testShowBug() {
        AvoidAssertAsIdentifierBug bug = new AvoidAssertAsIdentifierBug();
        assertEquals("foo", bug.showBug()); // This line should cause a compilation failure due to the bug in the AvoidAssertAsIdentifierBug class
        // TRIGGER BUG: AvoidAssertAsIdentifier
    }
}