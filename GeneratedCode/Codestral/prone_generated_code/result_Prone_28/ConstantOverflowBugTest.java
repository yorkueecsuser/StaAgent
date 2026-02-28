import org.junit.Test;
import static org.junit.Assert.*;

public class ConstantOverflowBugTest {
    @Test
    public void testConstantOverflow() {
        ConstantOverflowBug bug = new ConstantOverflowBug();
        assertEquals(86400000000000L, bug.showBug()); // TRIGGER BUG: ConstantOverflow
    }
}