import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    BugExample bugExample = new BugExample();

    @Test
    public void testShowBug() {
        int[] result = bugExample.showBug();

        // TRIGGER BUG: Values should not be uselessly incremented
        assertEquals(0, result[0]); // line 5: This test case fails because 'i' is not incremented properly, and 'j' is not returned properly.
    }
}