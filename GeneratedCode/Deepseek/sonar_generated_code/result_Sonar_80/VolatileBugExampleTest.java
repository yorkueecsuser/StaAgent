import org.junit.Test;
import static org.junit.Assert.*;

public class VolatileBugExampleTest {
    private final VolatileBugExample bugExample = new VolatileBugExample();

    @Test
    public void testBug1() {
        int[] result = bugExample.showBug();
        for (int i = 0; i < result.length; i++) {
            assertTrue(result[i] == i + 1); // TRIGGER BUG: Non-primitive fields should not be "volatile"
        }
    }

    @Test
    public void testBug2() {
        MyObj result = bugExample.showBug2();
        assertNotNull(result); // TRIGGER BUG: Non-primitive fields should not be "volatile"
    }
}