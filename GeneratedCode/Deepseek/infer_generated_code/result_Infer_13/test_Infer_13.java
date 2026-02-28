import org.junit.Test;
import static org.junit.Assert.*;

public class ResourceLeakTest {
    @Test
    public void testShowBug() {
        try {
            ResourceLeak.showBug();
        } catch (Exception e) {
            fail("Expected to fail due to resource leak"); // TRIGGER BUG: RESOURCE_LEAK​
        }
    }
}