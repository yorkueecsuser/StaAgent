import org.junit.Test;
import static org.junit.Assert.*;

public class ImpossibleInstanceofExampleTest {

    @Test
    public void testShowBugWithObject() {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object()); // TRIGGER BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
        assertTrue("Expected true, but got false", result); // This assertion will fail, triggering the bug
    }

    @Test
    public void testShowBugWithString() {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug("Some String"); // TRIGGER BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
        assertTrue("Expected true, but got false", result); // This assertion will fail, triggering the bug
    }
}