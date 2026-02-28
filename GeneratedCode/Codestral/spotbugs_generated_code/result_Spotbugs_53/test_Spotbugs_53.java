import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionNotThrownTest {
    @Test
    public void testShowBug() {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        try {
            exceptionNotThrown.showBug(-5);  // TRIGGER BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }
}