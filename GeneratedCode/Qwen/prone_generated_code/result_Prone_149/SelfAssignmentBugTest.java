import org.junit.Test;
import static org.junit.Assert.*;

public class SelfAssignmentBugTest {

    @Test
    public void testShowBug() {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug();
        int result = bugDemo.showBug(10); // TRIGGER BUG: SelfAssignment
        assertEquals(10, result);
    }

    @Test
    public void testShowBug2() {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug();
        String result = bugDemo.showBug2("Hello"); // TRIGGER BUG: SelfAssignment
        assertEquals("Hello", result);
    }

    @Test
    public void testShowBugWithNull() {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug();
        try {
            bugDemo.showBug2(null); // TRIGGER BUG: SelfAssignment
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }
}