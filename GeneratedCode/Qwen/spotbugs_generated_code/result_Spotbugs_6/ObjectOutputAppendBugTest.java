import org.junit.Test;
import static org.junit.Assert.*;

public class ObjectOutputAppendBugTest {

    @Test
    public void testShowBug() {
        ObjectOutputAppendBug bugDemo = new ObjectOutputAppendBug();
        bugDemo.showBug("example.ser"); // TRIGGER BUG: IO: Doomed attempt to append to an object output stream (IO_APPENDING_TO_OBJECT_OUTPUT_STREAM) 
    }
}