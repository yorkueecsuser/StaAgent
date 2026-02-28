import org.junit.Test;
import static org.junit.Assert.*;

public class XorPowerBugTest {
    @Test
    public void testShowBug() {
        int x = 2;
        int y = 2;
        int result = XorPowerBug.showBug(x, y);
        assertEquals(0, result); // TRIGGER BUG: XorPower
    }
}