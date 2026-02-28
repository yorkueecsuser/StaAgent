import org.junit.Test;
import static org.junit.Assert.*;

public class StreamReadBugTest {

    @Test
    public void testShowBug() {
        StreamReadBug bug = new StreamReadBug();
        byte[] result = bug.showBug("testfile.txt");  // TRIGGER BUG: The value returned from a stream read should be checked
        assertNotNull(result);
        assertEquals(1000, result.length);
    }

    @Test
    public void testShowBug2() {
        StreamReadBug bug = new StreamReadBug();
        long result = bug.showBug2("testfile.txt", 100);  // TRIGGER BUG: The value returned from a stream skip should be checked
        assertEquals(100, result);
    }
}