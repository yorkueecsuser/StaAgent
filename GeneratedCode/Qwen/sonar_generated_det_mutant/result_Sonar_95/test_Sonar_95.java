import org.junit.Test;
import static org.junit.Assert.*;

public class ObjectOutputStreamBugExampleTest {

    @Test
    public void testShowBug() throws Exception {
        ObjectOutputStreamBugExample example = new ObjectOutputStreamBugExample();
        example.showBug("example.ser"); // TRIGGER BUG: Files opened in append mode should not be used with "ObjectOutputStream"
    }
}