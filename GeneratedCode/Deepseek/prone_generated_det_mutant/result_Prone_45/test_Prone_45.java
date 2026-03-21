import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    // TRIGGER BUG: EqualsNaN
    public void testShowBug() {
        double nan = BugExample.showBug();
        assertFalse(nan == nan); // Expect this to fail
    }
}