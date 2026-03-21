import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    private final BugExample bugExample = new BugExample();

    @Test
    public void testDoRangeCheck() {
        int result = bugExample.showBug();
        // TRIGGER BUG: Min and max used in combination should not always return the same value
        assertEquals(20, result); // expected:<20> but was:<12>
    }
}