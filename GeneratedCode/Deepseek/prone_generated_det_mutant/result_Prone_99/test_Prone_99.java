import org.junit.Test;
import static org.junit.Assert.*;

public class LiteByteStringUtf8BugTest {
    LiteByteStringUtf8Bug bug = new LiteByteStringUtf8Bug();

    @Test
    public void testShowBug() {
        byte[] byteString = "Hello World".getBytes();
        String result = bug.showBug(byteString);
        assertNotNull(result); // This will fail if the result is null
        // TRIGGER BUG: LiteByteStringUtf8
        assertNotEquals(result, new String(byteString));
    }
}