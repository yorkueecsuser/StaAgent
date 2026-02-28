import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamReadBugDemoTest {

    @Test
    public void testShowBug() {
        // Arrange
        String fileName = "testFile.txt";
        createTestFile(fileName, "Hello, World!");

        StreamReadBugDemo demo = new StreamReadBugDemo();
        
        // Act
        String result = demo.showBug(fileName);  // TRIGGER BUG: The value returned from a stream read should be checked
        
        // Assert
        assertEquals("Hello, World!", result.trim());  // Test will fail due to bug
    }

    private void createTestFile(String fileName, String content) {
        try (FileOutputStream fos = new FileOutputStream(new File(fileName))) {
            fos.write(content.getBytes());
        } catch (IOException e) {
            fail("Failed to create test file: " + e.getMessage());
        }
    }
}