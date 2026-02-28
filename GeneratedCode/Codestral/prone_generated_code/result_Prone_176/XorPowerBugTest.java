import org.junit.Test;
import static org.junit.Assert.*;

public class XorPowerBugTest {
    XorPowerBug xorPowerBug = new XorPowerBug();

    @Test
    public void testShowBug() {
        assertEquals("Bug triggered: XOR is used instead of power", 4, xorPowerBug.showBug(2, 2)); // TRIGGER BUG: XorPower
    }
}