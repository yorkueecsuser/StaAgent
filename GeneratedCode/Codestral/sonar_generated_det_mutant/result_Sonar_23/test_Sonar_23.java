import org.junit.Test;
import static org.junit.Assert.*;

public class ClassCastBugTest {
    @Test
    public void testShowBugWithString() {
        ClassCastBug bug = new ClassCastBug();
        assertEquals("test string", bug.showBug("TEST STRING")); // should pass
    }

    @Test(expected = ClassCastException.class)
    public void testShowBugWithNonString() {
        ClassCastBug bug = new ClassCastBug();
        bug.showBug(123); // TRIGGER BUG: Cast operations should not trigger a ClassCastException
    }
}