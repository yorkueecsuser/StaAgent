import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        double result = BugExample.showBug();
        assertEquals(2.0, result, 0.001); // This assertion should fail
    }
}