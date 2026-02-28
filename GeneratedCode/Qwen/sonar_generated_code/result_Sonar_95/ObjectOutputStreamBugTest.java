import org.junit.Test;
import static org.junit.Assert.*;

public class ObjectOutputStreamBugTest {

    @Test
    public void testShowBug() {
        ObjectOutputStreamBug bugDemo = new ObjectOutputStreamBug();
        bugDemo.showBug("buggyFile.ser"); // TRIGGER BUG: Files opened in append mode should not be used with "ObjectOutputStream"
    }
}