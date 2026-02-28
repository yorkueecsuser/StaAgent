import org.junit.Test;
import static org.junit.Assert.*;

public class EqBugTest {
    @Test
    public void testEqualsMethod() {
        // TRIGGER BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
        Object obj1 = new Object();
        Object obj2 = new Object();
        assertFalse(obj1.equals(obj2));
    }
}