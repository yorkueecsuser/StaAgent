import org.junit.Test;
import static org.junit.Assert.*;

public class StreamReadBugTest {
    @Test
    public void testShowBug() {
        byte[] data = {1, 2, 3};
        StreamReadBug bug = new StreamReadBug();
        int result = bug.showBug(data);
        assertEquals(1, result);  // TRIGGER BUG: The value returned from a stream read should be checked
    }
}