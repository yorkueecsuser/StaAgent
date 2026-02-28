import org.junit.Test;
import static org.junit.Assert.*;

public class NullAssignmentExampleTest {

    @Test
    public void testShowBug() {
        NullAssignmentExample example = new NullAssignmentExample();
        example.showBug(); // TRIGGER BUG: NullAssignment
    }
}