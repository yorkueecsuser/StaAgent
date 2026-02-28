import org.junit.Test;
import static org.junit.Assert.*;

public class AssignmentInOperandTest {
    @Test
    public void testBug() {
        int x = 10;
        assertEquals(10, x);

        x = x + 5; // TRIGGER BUG: AssignmentInOperand
        assertEquals(15, x);
    }
}