import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testShowBug() {
        BugExample bug1 = new BugExample(1);
        BugExample bug2 = new BugExample(1);
        assertEquals(-1, bug1.showBug(bug2)); // TRIGGER BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
    }
}