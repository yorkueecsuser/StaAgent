import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionCreationWithoutThrowingTest {

    @Test
    public void testShowBugWithNegativeValue() {
        ExceptionCreationWithoutThrowing example = new ExceptionCreationWithoutThrowing();
        assertEquals("No exception thrown", example.showBug(-1)); // TRIGGER BUG: Exceptions should not be created without being thrown
    }

    @Test
    public void testShowBugWithZeroValue() {
        ExceptionCreationWithoutThrowing example = new ExceptionCreationWithoutThrowing();
        assertEquals("No exception thrown", example.showBug(0));
    }

    @Test
    public void testShowBugWithPositiveValue() {
        ExceptionCreationWithoutThrowing example = new ExceptionCreationWithoutThrowing();
        assertEquals("No exception thrown", example.showBug(1));
    }
}