import org.junit.Test;
import static org.junit.Assert.*;

class ThrowExceptionTest {
    @Test
    public void testBug() {
        ThrowException throwException = new ThrowException();
        try {
            throwException.showBug();
            fail("Exception not thrown"); // TRIGGER BUG: Exceptions should not be created without being thrown
        } catch (IllegalArgumentException e) {
            assertEquals("x must be nonnegative", e.getMessage());
        }
    }
}