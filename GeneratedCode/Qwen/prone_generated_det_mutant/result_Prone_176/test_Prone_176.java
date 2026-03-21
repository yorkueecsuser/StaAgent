import org.junit.Test;
import static org.junit.Assert.*;

public class XorPowerBugTest {

    @Test
    public void testShowBugWithBase2Exponent2() {
        XorPowerBug bugDemo = new XorPowerBug();
        int result = bugDemo.showBug(2, 2); // TRIGGER BUG: XorPower
        assertEquals(4, result); // This will fail because 2 ^ 2 is 0, not 4
    }

    @Test
    public void testShowBugWithBase3Exponent3() {
        XorPowerBug bugDemo = new XorPowerBug();
        int result = bugDemo.showBug(3, 3); // TRIGGER BUG: XorPower
        assertEquals(27, result); // This will fail because 3 ^ 3 is 0, not 27
    }

    @Test
    public void testShowBugWithBase4Exponent4() {
        XorPowerBug bugDemo = new XorPowerBug();
        int result = bugDemo.showBug(4, 4); // TRIGGER BUG: XorPower
        assertEquals(256, result); // This will fail because 4 ^ 4 is 0, not 256
    }
}