import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionCreationWithoutThrowingTest {

    // Test method to trigger the bug
    @Test
    public void testShowBug() {
        ExceptionCreationWithoutThrowing example = new ExceptionCreationWithoutThrowing();
        example.showBug(-1); // TRIGGER BUG: Exceptions should not be created without being thrown
    }

    // Another test method to demonstrate the bug
    @Test
    public void testShowBugWithNegativeInput() {
        ExceptionCreationWithoutThrowing example = new ExceptionCreationWithoutThrowing();
        example.showBug(-100); // TRIGGER BUG: Exceptions should not be created without being thrown
    }
}