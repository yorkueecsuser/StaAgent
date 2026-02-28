import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionBugExampleTest {

    @Test
    public void testShowBug() {
        AssertionBugExample example = new AssertionBugExample();
        // TRIGGER BUG: AssertJ methods setting the assertion context should come before an assertion
        assertEquals("Pass", example.showBug("test", "test"));
        // TRIGGER BUG: AssertJ methods setting the assertion context should come before an assertion
        assertEquals("Fail", example.showBug("test", "expected"));
    }

    @Test
    public void testShowBug1() {
        AssertionBugExample example = new AssertionBugExample();
        // TRIGGER BUG: AssertJ methods setting the assertion context should come before an assertion
        assertEquals("Pass", example.showBug1("test", "test"));
        // TRIGGER BUG: AssertJ methods setting the assertion context should come before an assertion
        assertEquals("Fail", example.showBug1("test", "expected"));
    }

    @Test
    public void testShowBug2() {
        AssertionBugExample example = new AssertionBugExample();
        // TRIGGER BUG: AssertJ methods setting the assertion context should come before an assertion
        assertEquals("Pass", example.showBug2(5, 5));
        // TRIGGER BUG: AssertJ methods setting the assertion context should come before an assertion
        assertEquals("Fail", example.showBug2(5, 10));
    }
}