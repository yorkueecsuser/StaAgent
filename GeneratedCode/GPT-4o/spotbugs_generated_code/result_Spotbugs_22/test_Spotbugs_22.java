import org.junit.Test;
import static org.junit.Assert.*;

public class ClassNameEqualityBugTest {

    @Test
    public void testEqualsMethodBug() {
        ClassNameEqualityBug obj1 = new ClassNameEqualityBug("test");
        ClassNameEqualityBug obj2 = new ClassNameEqualityBug("test");

        // This should be true because both objects have the same value and are of the same class
        assertTrue(obj1.showBug(obj2)); // TRIGGER BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
    }
}