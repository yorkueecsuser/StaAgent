import org.junit.Test;
import static org.junit.Assert.*;

public class TryFailThrowableBugTest {
    @Test
    public void testMain() {
        try {
            TryFailThrowableBug.main(null);
        } catch (Throwable t) {
            fail("Expected NullPointerException but got " + t);
        }
        // TRIGGER BUG: TryFailThrowable
    }
}