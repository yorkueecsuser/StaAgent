import org.junit.Test;
import static org.junit.Assert.*;

public class NonThreadSafeExampleTest {

    @Test
    public void testShowBug() {
        NonThreadSafeExample example = new NonThreadSafeExample();
        example.showBug(); // TRIGGER BUG: Non-thread-safe fields should not be static
    }
}