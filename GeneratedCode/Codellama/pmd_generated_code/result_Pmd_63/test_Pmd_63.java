import org.junit.Test;
import static org.junit.Assert.*;

public class NullAssignmentBugTest {
    @Test
    public void testNullAssignment() {
        NullAssignmentBug nb = new NullAssignmentBug("John", 30);
        nb.showBug();
        // TRIGGER BUG: NullAssignment
        assertEquals(null, nb.getName());
    }
}