import org.junit.Test;
import static org.junit.Assert.*;

public class SelfAssignmentBugTest {

    @Test
    public void testShowBug() {
        SelfAssignmentBug bugClass = new SelfAssignmentBug();
        String testName = "TestName";
        String result = bugClass.showBug(testName);
        assertNotEquals(testName, result); // TRIGGER BUG: Variables should not be self-assigned
    }
}