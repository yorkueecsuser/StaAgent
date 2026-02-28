import org.junit.Test;
import static org.junit.Assert.*;

public class NullAssignmentExampleTest {

    @Test
    public void testShowBug() {
        NullAssignmentExample example = new NullAssignmentExample();
        String result = example.showBug("Hello, World!"); // TRIGGER BUG: NullAssignment
        assertNotNull(result); // This assertion will fail because the method returns null
    }
}