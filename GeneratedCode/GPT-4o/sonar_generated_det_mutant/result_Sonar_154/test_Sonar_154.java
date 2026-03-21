import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyExternalizableClassTest {

    @Test
    public void testShowBugWithValidString() {
        BuggyExternalizableClass buggy = new BuggyExternalizableClass("test");
        String result = buggy.showBug("test"); // TRIGGER BUG: "Externalizable" classes should have no-arguments constructors
        assertEquals("test", result); // This line will not be reached due to the bug
    }

    @Test
    public void testShowBugWithEmptyString() {
        BuggyExternalizableClass buggy = new BuggyExternalizableClass("");
        String result = buggy.showBug(""); // TRIGGER BUG: "Externalizable" classes should have no-arguments constructors
        assertEquals("", result); // This line will not be reached due to the bug
    }

    @Test
    public void testShowBugWithNullString() {
        BuggyExternalizableClass buggy = new BuggyExternalizableClass(null);
        String result = buggy.showBug(null); // TRIGGER BUG: "Externalizable" classes should have no-arguments constructors
        assertNull(result); // This line will not be reached due to the bug
    }
}