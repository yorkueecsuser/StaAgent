import org.junit.Test;
import static org.junit.Assert.*;

public class DeadStoreBugTest {
    @Test
    public void testShowBug() {
        String result = DeadStoreBug.showBug();
        // TRIGGER BUG: Map values should not be replaced unconditionally
        assertNotEquals("Apple", result);
    }
}