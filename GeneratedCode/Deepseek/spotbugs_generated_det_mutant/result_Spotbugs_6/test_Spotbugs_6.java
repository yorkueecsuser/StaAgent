import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class MainTest {
    @Test
    // TRIGGER BUG: IO: Doomed attempt to append to an object output stream (IO_APPENDING_TO_OBJECT_OUTPUT_STREAM)
    public void testShowBug() throws IOException {
        File file = new File("test.txt");
        OutputStream out = new FileOutputStream(file, true);
        ObjectOutputStream objOut = new ObjectOutputStream(out); // This line triggers the bug

        // Let's create a simple object
        String obj = "Test";

        // Attempt to append the object to the ObjectOutputStream
        objOut.writeObject(obj);

        // Close the ObjectOutputStream and the underlying stream
        objOut.close();
        out.close();
    }
}