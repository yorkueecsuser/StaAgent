import org.junit.Test;
import static org.junit.Assert.*;

public class SelfAssignmentBugTest {
    @Test
    public void testShowBug() {
        SelfAssignmentBug buggyObject = new SelfAssignmentBug();
        String inputName = "TestName";
        buggyObject.showBug(inputName);  // TRIGGER BUG: Variables should not be self-assigned
        assertNotEquals(inputName, buggyObject.getName());
    }
}