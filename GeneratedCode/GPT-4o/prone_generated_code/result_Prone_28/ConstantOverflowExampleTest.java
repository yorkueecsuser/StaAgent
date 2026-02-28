import org.junit.Test;
import static org.junit.Assert.*;

public class ConstantOverflowExampleTest {

    @Test
    public void testShowBug() {
        ConstantOverflowExample example = new ConstantOverflowExample();
        long expectedValue = 24L * 60 * 60 * 1000 * 1000 * 1000; // Expected correct value
        assertEquals(expectedValue, example.showBug()); // TRIGGER BUG: ConstantOverflow
    }
}