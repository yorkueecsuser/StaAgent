import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class BuggyCodeTest {

    // TRIGGER BUG: "read" and "readLine" return values should be used
    @Test
    public void testShowBug() {
        BuggyCode buggyCode = new BuggyCode();
        try {
            buggyCode.showBug();
        } catch (Exception e) {
            fail("Should have thrown an exception"); // TRIGGER BUG: "read" and "readLine" return values should be used
        }
    }
}