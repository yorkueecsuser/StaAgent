import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyToStringTest {
    @Test
    public void testToString() {
        BuggyToString bt = new BuggyToString();
        assertNotNull("toString() should not return null // TRIGGER BUG: 'toString()' and 'clone()' methods should not return null", bt.showBug());
    }
}