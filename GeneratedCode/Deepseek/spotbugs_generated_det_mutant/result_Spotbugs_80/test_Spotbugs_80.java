import org.junit.Test;
import static org.junit.Assert.*;

public class ByteComparisonBugTest {
    @Test
    public void testShowBug() {
        ByteComparisonBug bug = new ByteComparisonBug();
        assertEquals(1, bug.showBug()); // TRIGGER BUG: INT: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)
    }
}