import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    BugExample bug = new BugExample();

    @Test
    public void testShowBug() {
        int result = bug.showBug();
        assertTrue("Expecting a positive result, as Math.abs(Integer.MIN_VALUE) is still Integer.MIN_VALUE", result > 0);
    }
}