import org.junit.Test;
import static org.junit.Assert.*;

public class AssertJBugExampleTest {
    private final AssertJBugExample example = new AssertJBugExample();

    @Test
    public void testShowBug() {
        String actual = "Test";
        String expected = "Fail";
        assertEquals("Custom Fail Message", example.showBug(actual, expected)); // TRIGGER BUG: AssertJ methods setting the assertion context should come before an assertion
    }

    @Test
    public void testShowBug2() {
        String actual = "Test";
        String expected = "Fail";
        assertEquals("Custom Fail Message", example.showBug2(actual, expected)); // TRIGGER BUG: AssertJ methods setting the assertion context should come before an assertion
    }

    @Test
    public void testShowBug3() {
        Integer actual = 10;
        Integer expected = 20;
        assertEquals("Fail", example.showBug3(actual, expected)); // TRIGGER BUG: AssertJ methods setting the assertion context should come before an assertion
    }
}