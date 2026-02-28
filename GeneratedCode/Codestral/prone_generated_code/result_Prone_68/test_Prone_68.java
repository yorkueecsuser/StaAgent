import org.junit.Test;
import static org.junit.Assert.*;

public class IdentityHashMapBoxingBugTest {
    @Test
    public void testShowBug() {
        Object result = IdentityHashMapBoxingBug.showBug();
        assertNotNull("Result should not be null", result); // TRIGGER BUG: IdentityHashMapBoxing
    }
}