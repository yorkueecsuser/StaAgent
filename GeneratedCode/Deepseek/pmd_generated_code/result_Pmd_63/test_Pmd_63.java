import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testShowBug() {
        BugExample be = new BugExample();
        assertNotNull(be.showBug()); // TRIGGER BUG: NullAssignment
    }
}