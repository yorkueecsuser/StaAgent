import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {

    @Test
    public void testEqualsMethod() {
        BuggyClass buggy = new BuggyClass();
        BuggyClass other = new BuggyClass();

        // This will trigger the bug
        assertEquals(buggy.equals(other), true); // TRIGGER BUG: Eq: equals() method defined that doesn’t override Object.equals(Object) (EQ_OTHER_USE_OBJECT)
    }
}