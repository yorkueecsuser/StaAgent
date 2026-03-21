import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BuggyCodeTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void triggerBugTest() {
        System.setOut(new PrintStream(outContent));
        BuggyCode bc = new BuggyCode();
        bc.showBug(); // TRIGGER BUG: "runFinalizersOnExit" should not be called
        assertEquals("Shutdown operations are being done.\n", outContent.toString());
    }
}