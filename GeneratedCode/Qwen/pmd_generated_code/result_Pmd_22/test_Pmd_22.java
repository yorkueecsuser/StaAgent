import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class SkipExampleTest {

    @Test
    public void testShowBugWithSmallFile() throws IOException {
        SkipExample example = new SkipExample("smallFile.txt"); // smallFile.txt should be a file with less than 10 bytes
        long skippedBytes = example.showBug(10); // TRIGGER BUG: CheckSkipResult
        assertEquals(10, skippedBytes); // This will fail because the file is smaller than 10 bytes
    }

    @Test
    public void testShowBugWithEmptyFile() throws IOException {
        SkipExample example = new SkipExample("emptyFile.txt"); // emptyFile.txt should be an empty file
        long skippedBytes = example.showBug(5); // TRIGGER BUG: CheckSkipResult
        assertEquals(5, skippedBytes); // This will fail because the file is empty
    }
}