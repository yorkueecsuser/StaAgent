import org.junit.Test;
import static org.junit.Assert.*;

public class UnaryOperatorBugTest {

    private UnaryOperatorBug bugInstance = new UnaryOperatorBug();

    @Test
    public void testShowBug1() {
        int result = bugInstance.showBug1(); // TRIGGER BUG: AvoidMultipleUnaryOperators
        assertEquals(1, result);
    }

    @Test
    public void testShowBug2() {
        boolean result = bugInstance.showBug2(); // TRIGGER BUG: AvoidMultipleUnaryOperators
        assertTrue(result);
    }

    @Test
    public void testShowBug3() {
        int result = bugInstance.showBug3(); // TRIGGER BUG: AvoidMultipleUnaryOperators
        assertEquals(-8, result);
    }
}