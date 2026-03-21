import org.junit.Test;
import static org.junit.Assert.*;

public class VariableSelfAssignmentTest {
    private VariableSelfAssignment instance = new VariableSelfAssignment();

    @Test
    public void testSelfAssignmentBug() {
        instance.showBug(); // TRIGGER BUG: Variables should not be self-assigned
    }
}