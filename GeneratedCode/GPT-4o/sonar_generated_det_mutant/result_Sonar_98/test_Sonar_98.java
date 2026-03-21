import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamReadBugDemoTest {

    @Test
    public void testShowBug() {
        // Create a temporary test file with fewer bytes than the buffer size
        String testFileName = "testFile.txt";
        createTestFile(testFileName, "Test data");
        
        StreamReadBugDemo demo = new StreamReadBugDemo();
        
        byte[] result = demo.showBug(testFileName); // TRIGGER BUG: The value returned from a stream read should be checked
        
        // The test will fail because the buffer will not be completely filled, as the return value of read is not checked
        assertEquals("Buffer should be filled with data", 1000, result.length);
    }

    private void createTestFile(String fileName, String content) {
        try (FileOutputStream fos = new FileOutputStream(new File(fileName))) {
            fos.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}