import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidCatchingThrowableTest {
    AvoidCatchingThrowable avoid = new AvoidCatchingThrowable();

    @Test
    public void testShowBug() {
        avoid.showBug(); // This should fail, triggering the bug
    }
}