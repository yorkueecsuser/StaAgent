import org.junit.Test;
import static org.junit.Assert.*;

public class IncorrectImmutableClassTest {

    @Test
    public void testMutableFieldModification() {
        StringBuilder sb = new StringBuilder("original");
        IncorrectImmutableClass obj = new IncorrectImmutableClass(10, sb);
        assertEquals("original", sb.toString()); // Initial state check
        obj.showBug(); // TRIGGER BUG: Immutable
        assertNotEquals("original", sb.toString()); // After modification check
    }
}