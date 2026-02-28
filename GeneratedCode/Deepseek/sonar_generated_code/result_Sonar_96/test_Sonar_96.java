import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    BuggyCode buggyCode = new BuggyCode();

    @Test
    public void testBugTrigger() {
        // TRIGGER BUG: "read" and "readLine" return values should be used
        buggyCode.showBug("test.txt"); // This line triggers the bug
    }
    
    @Test
    public void testBugFix() {
        buggyCode.showBugFixed("test.txt"); // This line does not trigger the bug
    }
}