import org.junit.Test;
import static org.junit.Assert.*;

public class NonThreadSafeStaticBugTest {
    @Test
    public void testNonThreadSafeStaticBug() {
        NonThreadSafeStaticBug.showBug(); // TRIGGER BUG: Non-thread-safe fields should not be static
    }
}