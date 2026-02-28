import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MutableStaticFieldTest {
    @Test
    public void testShowBug() {
        String expectedOutput = "Performing sensitive operation with data: Confidential Data\n";
        expectedOutput += "Performing sensitive operation with data: Malicious Data";

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // TRIGGER BUG: MS: Field isn’t final and cannot be protected from malicious code (MS_CANNOT_BE_FINAL)
        MutableStaticField.showBug();

        assertEquals(expectedOutput, outContent.toString().trim());
    }
}