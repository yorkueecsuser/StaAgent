import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testShowBug() {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
        assertArrayEquals(new int[] {10, 2, 3, 4, 5}, BugExample.arr); // TRIGGER BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)
    }
}