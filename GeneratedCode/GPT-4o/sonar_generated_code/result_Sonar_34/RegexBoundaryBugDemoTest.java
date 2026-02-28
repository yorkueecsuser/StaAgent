import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBoundaryBugDemoTest {

    @Test
    public void testShowBugWithExampleString() {
        RegexBoundaryBugDemo demo = new RegexBoundaryBugDemo();
        assertTrue(demo.showBug("example")); // TRIGGER BUG: Regex boundaries should not be used in a way that can never be matched
    }

    @Test
    public void testShowBugWithEmptyString() {
        RegexBoundaryBugDemo demo = new RegexBoundaryBugDemo();
        assertTrue(demo.showBug("")); // TRIGGER BUG: Regex boundaries should not be used in a way that can never be matched
    }

    @Test
    public void testShowBugWithSingleCharacter() {
        RegexBoundaryBugDemo demo = new RegexBoundaryBugDemo();
        assertTrue(demo.showBug("a")); // TRIGGER BUG: Regex boundaries should not be used in a way that can never be matched
    }
}