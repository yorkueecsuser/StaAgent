import org.junit.Test;
import static org.junit.Assert.*;

public class XorPowerBugTest {

    XorPowerBug bug = new XorPowerBug();

    @Test
    public void testShowBug() {
        int result = bug.showBug();
        // TRIGGER BUG: XorPower
        assertEquals(4, result); // Line 4 of XorPowerBug.java
    }
}