import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExceptionCreationWithoutThrowTest {

    @Test
    public void testShowBugWithNegativeInput() {
        ExceptionCreationWithoutThrow example = new ExceptionCreationWithoutThrow();
        example.showBug(-5); // TRIGGER BUG: Exceptions should not be created without being thrown
    }

    @Test
    public void testShowBugWithPositiveInput() {
        ExceptionCreationWithoutThrow example = new ExceptionCreationWithoutThrow();
        int result = example.showBug(10);
        assertEquals(20, result);
    }
}

class ExceptionCreationWithoutThrow {

    public int showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
            return -1; // Return a default value when x is negative
        }
        return x * 2; // Simple operation for demonstration
    }

    public static void main(String[] args) {
        ExceptionCreationWithoutThrow example = new ExceptionCreationWithoutThrow();
        System.out.println("Result with x = -5: " + example.showBug(-5));
        System.out.println("Result with x = 10: " + example.showBug(10));
    }
}