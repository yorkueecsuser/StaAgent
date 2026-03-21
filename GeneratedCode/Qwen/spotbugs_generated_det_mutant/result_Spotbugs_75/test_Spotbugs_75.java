import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsNullBugTest {

    @Test
    public void testShowBugWithNull() {
        EqualsNullBug bugDemo = new EqualsNullBug();
        assertFalse(bugDemo.showBug(null)); // TRIGGER BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }

    @Test
    public void testShowBugWithNonNull() {
        EqualsNullBug bugDemo = new EqualsNullBug();
        assertFalse(bugDemo.showBug("example")); // TRIGGER BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }
}