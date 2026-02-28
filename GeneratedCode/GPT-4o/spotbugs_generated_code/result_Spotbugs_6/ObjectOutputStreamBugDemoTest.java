import org.junit.Test;
import static org.junit.Assert.*;

public class ObjectOutputStreamBugDemoTest {

    @Test
    public void testShowBug() {
        ObjectOutputStreamBugDemo demo = new ObjectOutputStreamBugDemo();
        
        // First call to create the file and write an object
        demo.showBug("example.ser", "First object");

        // Second call should trigger the bug since it tries to append an object
        demo.showBug("example.ser", "Second object"); // TRIGGER BUG: IO: Doomed attempt to append to an object output stream (IO_APPENDING_TO_OBJECT_OUTPUT_STREAM)
    }
}