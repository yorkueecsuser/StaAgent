import org.junit.Test;
import static org.junit.Assert.*;

public class ThrowNullTest {
    @Test
    public void testThrowNull() {
        try {
            ThrowNull.throwNull(); // TRIGGER BUG: ThrowNull
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("Caught a NullPointerException", e.getMessage());
        }
    }
}