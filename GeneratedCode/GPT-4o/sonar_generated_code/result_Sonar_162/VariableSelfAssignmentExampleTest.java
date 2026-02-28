import org.junit.Test;
import static org.junit.Assert.*;

public class VariableSelfAssignmentExampleTest {

    @Test
    public void testShowBug() {
        VariableSelfAssignmentExample example = new VariableSelfAssignmentExample();
        example.showBug("Alice", 10); // TRIGGER BUG: Variables should not be self-assigned
    }
}