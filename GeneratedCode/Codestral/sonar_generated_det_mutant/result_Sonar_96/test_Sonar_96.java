import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadMethodBugTest {
    @Test
    public void testShowBug() throws IOException {
        File file = new File("test.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("This is a test line.\n");
        writer.close();

        ReadMethodBug bugExample = new ReadMethodBug();
        bugExample.showBug("test.txt"); // TRIGGER BUG: "read" and "readLine" return values should be used

        file.delete();
        fail("The test should have thrown an AssertionError");
    }
}