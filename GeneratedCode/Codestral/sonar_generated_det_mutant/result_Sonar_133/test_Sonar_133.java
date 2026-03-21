import org.junit.Test;
import static org.junit.Assert.*;

public class TernaryOperatorBugTest {

    @Test
    public void testShowBug() {
        TernaryOperatorBug bug = new TernaryOperatorBug();
        long result = bug.showBug(true, 10, 20L);

        // TRIGGER BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        assertEquals("Unexpected result", 10L, result);
    }
}