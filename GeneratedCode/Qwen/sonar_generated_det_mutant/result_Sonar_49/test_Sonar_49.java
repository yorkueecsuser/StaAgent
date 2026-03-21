import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionBugExampleTest {

    @Test
    public void testShowBug() {
        AssertionBugExample example = new AssertionBugExample();
        example.showBug("actual", "expected"); // TRIGGER BUG: AssertJ methods setting the assertion context should come before an assertion
    }

    @Test
    public void testShowBug1() {
        AssertionBugExample example = new AssertionBugExample();
        example.showBug1("actual", "expected"); // TRIGGER BUG: AssertJ methods setting the assertion context should come before an assertion
    }

    @Test
    public void testShowBug2() {
        AssertionBugExample example = new AssertionBugExample();
        example.showBug2("actual", "expected"); // TRIGGER BUG: AssertJ methods setting the assertion context should come before an assertion
    }
}