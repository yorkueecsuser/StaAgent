import org.junit.Test;
import static org.junit.Assert.*;

class NPNullInstanceOfBugTest {
    @Test
    public void testNullInstanceOf() {
        NPNullInstanceOfBug bug = new NPNullInstanceOfBug();
        Object obj = null;
        // TRIGGER BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        if (obj instanceof String) {
            fail("Bug triggered: null value is an instance of a type.");
        }
    }
}