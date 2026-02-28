import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class BuggyResourceClosingTest {
    @Test(expected = IOException.class)
    public void testShowBug() throws IOException {
        String fileName = "nonexistentfile.txt"; // Provide a non-existent file name to trigger the bug
        BuggyResourceClosing buggyResource = new BuggyResourceClosing(fileName);
        buggyResource.showBug(); // TRIGGER BUG: Resources should be closed
    }
}