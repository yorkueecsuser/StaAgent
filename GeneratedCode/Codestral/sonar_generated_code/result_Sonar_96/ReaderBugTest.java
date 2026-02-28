import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderBugTest {
    @Test
    public void testShowBug() {
        String fileName = "test.txt";
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("Test line\n");
            fileWriter.close();
        } catch (IOException e) {
            fail("Failed to create test file: " + e.getMessage());
        }

        ReaderBug readerBug = new ReaderBug();
        String result = readerBug.showBug(fileName);

        // TRIGGER BUG: "read" and "readLine" return values should be used
        assertEquals("", result);

        new File(fileName).delete();
    }
}