import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionNotThrownTest {
    @Test
    public void testBug() {
        int x = -1;
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // TRIGGER BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
        assertEquals("Program continues normally", ExceptionNotThrown.showBug(x));
    }
}