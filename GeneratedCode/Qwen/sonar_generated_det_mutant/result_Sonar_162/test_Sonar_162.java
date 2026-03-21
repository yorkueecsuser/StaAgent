import org.junit.Test;
import static org.junit.Assert.*;

public class SelfAssignmentBugTest {

    @Test
    public void testShowBug() {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug();
        assertEquals("John Doe", bugDemo.showBug("John Doe")); // TRIGGER BUG: Variables should not be self-assigned
    }
}