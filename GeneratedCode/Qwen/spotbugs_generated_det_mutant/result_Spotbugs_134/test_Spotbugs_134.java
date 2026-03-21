import org.junit.Test;
import static org.junit.Assert.*;

public class MonthBugDemoTest {

    @Test
    public void testShowBug() {
        MonthBugDemo demo = new MonthBugDemo();
        int result = demo.showBug(); // TRIGGER BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
        assertEquals(12, result); // This will fail because the actual result will be 0 (January) due to the bug
    }
}