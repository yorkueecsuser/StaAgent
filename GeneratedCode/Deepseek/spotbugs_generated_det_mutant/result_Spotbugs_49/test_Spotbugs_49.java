import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    @Test
    public void testShowBug() {
        BugExample bugExample = new BugExample();
        int[] array = {1, 2, 3, 4, 5};
        int offset = 6;
        // TRIGGER BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
        bugExample.showBug(array, offset); // This line triggers the bug
    }
}