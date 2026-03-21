import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.*;

public class InputStreamBugTest {
    @Test
    public void testShowBug() throws IOException {
        byte[] buffer = {1, 2, 3, 4, 5};
        InputStreamBug bug = new InputStreamBug(buffer);
        int result = bug.showBug();
        // TRIGGER BUG: InputSteam.read() implementation should not return a signed byte
        // The following line should fail because the read() method returns a signed byte, not an int
        assertEquals(result, 255); // Changed the expected value to 255 to trigger the bug
    }
}