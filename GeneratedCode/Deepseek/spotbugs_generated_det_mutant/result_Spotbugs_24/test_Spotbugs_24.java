import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {
    @Test
    // TRIGGER BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
    public void testEquals() {
        BuggyClass buggyObject1 = new BuggyClass("test");
        BuggyClass buggyObject2 = new BuggyClass("test");
        boolean result = buggyObject1.equals(buggyObject2);
        assertFalse(result); // Expecting the equals method to return false
    }
}