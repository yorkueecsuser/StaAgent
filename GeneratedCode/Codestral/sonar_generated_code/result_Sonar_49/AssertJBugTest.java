import org.junit.Test;
import static org.junit.Assert.*;

public class AssertJBugTest {
    @Test
    public void showBugTest() {
        String actual = "actual";
        String expected = "expected";
        AssertJBug bug = new AssertJBug();

        // TRIGGER BUG: AssertJ methods setting the assertion context should come before an assertion
        assertEquals("Description", expected, bug.showBug());
    }
}