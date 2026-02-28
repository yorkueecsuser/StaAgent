import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    private BugExample bugExample = new BugExample();

    @Test
    public void testShowBug() {
        String result = bugExample.showBug();
        assertEquals(10, result.length()); // TRIGGER BUG: UseStringBufferForStringAppends
    }

    @Test
    public void testGetStringLength() {
        int length = bugExample.getStringLength();
        assertEquals(10, length);
    }
}