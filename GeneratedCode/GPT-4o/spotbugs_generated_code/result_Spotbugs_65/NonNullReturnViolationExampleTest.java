import org.junit.Test;
import static org.junit.Assert.*;

public class NonNullReturnViolationExampleTest {

    @Test
    public void testShowBugReturnsNull() {
        NonNullReturnViolationExample example = new NonNullReturnViolationExample();
        String result = example.showBug(true); // TRIGGER BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
        assertNotNull("Expected non-null result, but got null", result);
    }
}