import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    BugExample bugExample = new BugExample();

    @Test
    public void testShowBug1() {
        int target = -5;
        int num = 3;

        target =- num;
        assertEquals("TRIGGER BUG: Non-existent operators like \"=+\" should not be used", -3, bugExample.showBug1());
    }

    @Test
    public void testShowBug2() {
        int target = -5;
        int num = 3;

        target =+ num;
        assertEquals("TRIGGER BUG: Non-existent operators like \"=+\" should not be used", 3, bugExample.showBug2());
    }
}