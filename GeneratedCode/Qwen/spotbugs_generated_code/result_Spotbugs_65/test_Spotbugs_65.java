import org.junit.Test;
import static org.junit.Assert.*;

public class NonNullReturnViolationExampleTest {

    @Test
    public void testShowBugReturnsNonNull() {
        NonNullReturnViolationExample example = new NonNullReturnViolationExample();
        assertNotNull("Expected non-null string", example.showBug(false));
    }

    @Test
    public void testShowBugReturnsNull() {
        NonNullReturnViolationExample example = new NonNullReturnViolationExample();
        assertEquals("Expected null string", null, example.showBug(true)); // TRIGGER BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
    }
}