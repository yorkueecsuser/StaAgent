import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    BugExample bugExample = new BugExample();

    @Test
    public void testShowBug() {
        assertFalse("The arrays are equal, they should not be // TRIGGER BUG: ArrayEquals", bugExample.showBug()); // Line 11
    }
}