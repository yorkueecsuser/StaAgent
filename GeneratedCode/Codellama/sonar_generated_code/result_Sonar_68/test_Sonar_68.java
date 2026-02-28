import org.junit.Test;
import static org.junit.Assert.*;

public class ConditionalBugTest {
    @Test
    public void testBug() {
        ConditionalBug buggy = new ConditionalBug();
        int b = buggy.getBuggyValue();
        assertEquals(0, b); // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
    }

    @Test
    public void testBug2() {
        ConditionalBug buggy = new ConditionalBug();
        int b = buggy.getBuggyValue();
        assertEquals(1, b); // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
    }
}