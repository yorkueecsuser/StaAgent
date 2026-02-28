import org.junit.Test;
import static org.junit.Assert.*;

public class AlwaysFalseEqualsTest {

    @Test
    public void testShowBug() {
        AlwaysFalseEquals example = new AlwaysFalseEquals(1, "Example");
        // This will trigger the bug because showBug() calls equals which always returns false
        assertTrue(example.showBug()); // TRIGGER BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
    }

    @Test
    public void testEqualsReflexivity() {
        AlwaysFalseEquals obj = new AlwaysFalseEquals(1, "TestObject");
        // This will trigger the bug because obj.equals(obj) should return true but will return false
        assertTrue(obj.equals(obj)); // TRIGGER BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
    }

    @Test
    public void testEqualsSymmetry() {
        AlwaysFalseEquals obj1 = new AlwaysFalseEquals(1, "Object1");
        AlwaysFalseEquals obj2 = new AlwaysFalseEquals(1, "Object1");
        // This will trigger the bug because obj1.equals(obj2) should return true but will return false
        assertTrue(obj1.equals(obj2)); // TRIGGER BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
    }
}