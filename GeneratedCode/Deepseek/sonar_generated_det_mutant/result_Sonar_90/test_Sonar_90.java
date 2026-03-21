import org.junit.Test;
import static org.junit.Assert.*;

public class NonThreadSafeStaticTest {
    // TRIGGER BUG: Non-thread-safe fields should not be static
    @Test
    public void testShowBug() {
        NonThreadSafeStatic.showBug(); // TRIGGER BUG: Non-thread-safe fields should not be static
    }
}