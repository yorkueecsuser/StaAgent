import org.junit.Test;
import static org.junit.Assert.*;

public class AssertIdentifierBugTest {

    @Test
    public void testShowBug() {
        AssertIdentifierBug bugDemo = new AssertIdentifierBug();
        assertEquals("foo", bugDemo.showBug()); // TRIGGER BUG: AvoidAssertAsIdentifier
    }
}