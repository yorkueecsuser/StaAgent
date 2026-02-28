import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class ObjectOutputStreamAppendBugTest {

    @Test(expected = IOException.class)
    public void testShowBug() throws IOException {
        ObjectOutputStreamAppendBug bugDemo = new ObjectOutputStreamAppendBug();
        bugDemo.showBug();
        // TRIGGER BUG: IO: Doomed attempt to append to an object output stream (IO_APPENDING_TO_OBJECT_OUTPUT_STREAM)
        bugDemo.showBug();
    }
}