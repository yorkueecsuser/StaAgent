import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerOverflowExampleTest {

    @Test
    public void testShowBug() {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int result = example.showBug(); // TRIGGER BUG: INTEGER_OVERFLOW_L1
        assertEquals(2147483650L, result); // This assertion will fail due to integer overflow
    }
}