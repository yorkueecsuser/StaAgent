import org.junit.Test;
import static org.junit.Assert.*;

public class SelfEqualsTest {

    @Test
    public void testEquals() {
        SelfEquals obj1 = new SelfEquals(1);
        SelfEquals obj2 = new SelfEquals(1);

        // TRIGGER BUG: SelfEquals
        assertTrue(obj1.showBug()); // Line 12

        // This line will trigger the SelfEquals bug
        assertFalse(obj1.equals(obj2)); // Line 14
    }
}