import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsNullBugTest {

    @Test
    public void testIsNullWithNullValue() {
        EqualsNullBug bug = new EqualsNullBug(null);
        assertTrue(bug.isNull()); // TRIGGER BUG: EqualsNull
        bug.showBug();
    }

    @Test
    public void testIsNullWithNonNullValue() {
        EqualsNullBug bug = new EqualsNullBug("foo");
        assertFalse(bug.isNull());
        bug.showBug();
    }
}