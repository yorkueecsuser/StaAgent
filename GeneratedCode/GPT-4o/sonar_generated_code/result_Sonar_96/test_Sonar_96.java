import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class ReaderExampleTest {

    @Test
    public void testShowBug() {
        ReaderExample readerExample = new ReaderExample();
        String testFileName = "testFile.txt";

        // Create a test file with some content
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(testFileName))) {
            writer.write("Line 1\nLine 2\nLine 3");
        } catch (IOException e) {
            fail("Failed to create test file");
        }

        // Attempt to read from the file and trigger the bug
        readerExample.showBug(testFileName); // TRIGGER BUG: "read" and "readLine" return values should be used

        // Clean up the test file
        new File(testFileName).delete();
    }
}