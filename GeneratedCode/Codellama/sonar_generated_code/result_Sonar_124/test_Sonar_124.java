import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyMathTest {

    @Test
    public void testBug() {
        int a = 2, b = 3;
        float c = a / b; // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(0.6666667, c, 0.0);
    }
}