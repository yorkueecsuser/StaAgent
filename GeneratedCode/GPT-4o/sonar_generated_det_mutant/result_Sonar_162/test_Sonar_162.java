import org.junit.Test;
import static org.junit.Assert.*;

public class VariableSelfAssignmentExampleTest {

    @Test
    public void testShowBugWithNonNullName() {
        VariableSelfAssignmentExample example = new VariableSelfAssignmentExample();
        String result = example.showBug("Alice"); // TRIGGER BUG: Variables should not be self-assigned
        assertEquals("The name should have been set to 'Alice'", "Alice", result);
    }

    @Test
    public void testShowBugWithNullName() {
        VariableSelfAssignmentExample example = new VariableSelfAssignmentExample();
        String result = example.showBug(null); // TRIGGER BUG: Variables should not be self-assigned
        assertNull("The name should have been set to null", result);
    }
}