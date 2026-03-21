import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.logging.Logger;

public class BugExampleTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Test
    // TRIGGER BUG: FloggerLogVarargs
    public void testShowBug() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));

        BugExample bugExample = new BugExample();
        bugExample.showBug("John Doe", 25);

        assertTrue(outContent.toString().contains("Name: John Doe, Age: 25"));

        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}