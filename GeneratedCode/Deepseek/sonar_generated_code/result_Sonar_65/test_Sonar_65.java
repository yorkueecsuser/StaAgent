import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    BugExample bugExample = new BugExample();

    @Test
    public void testShowBug() {
        String[] myArray = new String[0];
        boolean result = bugExample.showBug(myArray);

        assertFalse(result); // TRIGGER BUG: Collection sizes and array length comparisons should make sense
    }
}