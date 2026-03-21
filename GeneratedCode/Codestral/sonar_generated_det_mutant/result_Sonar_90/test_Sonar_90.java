import org.junit.Test;
import static org.junit.Assert.*;

public class NonThreadSafeStaticFieldBugTest {
    @Test
    public void testShowBug() throws InterruptedException {
        NonThreadSafeStaticFieldBug bugObject = new NonThreadSafeStaticFieldBug();
        bugObject.showBug(); // TRIGGER BUG: Non-thread-safe fields should not be static
    }
}