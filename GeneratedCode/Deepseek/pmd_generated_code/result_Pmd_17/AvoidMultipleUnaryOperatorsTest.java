import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidMultipleUnaryOperatorsTest {

    AvoidMultipleUnaryOperators obj = new AvoidMultipleUnaryOperators();

    @Test
    // TRIGGER BUG: AvoidMultipleUnaryOperators
    public void testShowBug() {
        int i = obj.showBug();
        assertEquals("Test failed", 1, i);
    }
}