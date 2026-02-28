import org.junit.Test;
import static org.junit.Assert.*;

public class XorPowerExampleTest {

    @Test
    public void testDemonstrateXorPowerBug() {
        XorPowerExample example = new XorPowerExample();
        int expected = 4; // 2 raised to the power 2 is 4
        int result = example.demonstrateXorPowerBug(2, 2); // TRIGGER BUG: XorPower
        assertEquals(expected, result); // This assertion will fail and trigger the bug
    }
}