import org.junit.Test;
import static org.junit.Assert.*;

public class StreamReadBugTest {

    @Test
    public void testShowBug() {
        byte[] data = new byte[500]; // Less data than the buffer size
        StreamReadBug bug = new StreamReadBug();
        int[] result = bug.showBug(data);

        // TRIGGER BUG: The value returned from a stream read should be checked
        // The result array will contain unexpected values in the last 500 positions, as the buffer was not fully filled
        for (int i = 500; i < result.length; i++) {
            assertEquals("Unexpected value at position " + i, 0, result[i]);
        }
    }
}