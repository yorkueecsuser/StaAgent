import org.junit.Test;
import static org.junit.Assert.*;

public class AlwaysTrueEqualsTest {

    @Test
    public void testEqualsMethodAlwaysReturnsTrue() {
        AlwaysTrueEquals obj1 = new AlwaysTrueEquals("Alice");
        AlwaysTrueEquals obj2 = new AlwaysTrueEquals("Bob");

        assertFalse("obj1 and obj2 should not be equal", obj1.equals(obj2)); // TRIGGER BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE) 
        assertFalse("obj2 and obj1 should not be equal", obj2.equals(obj1)); // TRIGGER BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE) 
    }

    @Test
    public void testShowBugMethod() {
        AlwaysTrueEquals example = new AlwaysTrueEquals("Example");
        example.showBug(); // TRIGGER BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE) 
    }
}