import org.junit.Test;
import static org.junit.Assert.*;

public class SelfAssignmentExampleTest {

    @Test
    public void testShowBug() {
        SelfAssignmentExample example = new SelfAssignmentExample(10);
        int result = example.showBug(); // TRIGGER BUG: SelfAssignment
        assertEquals("The value should remain 10 after self-assignment, but it triggers a bug.", 10, result);
    }
}