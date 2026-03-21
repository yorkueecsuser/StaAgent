import org.junit.Test;
import java.io.FileInputStream;
import static org.junit.Assert.*;

public class ResourceLeakTest {

    @Test
    public void testShowBug() {
        ResourceLeak resourceLeak = new ResourceLeak();
        FileInputStream fis = resourceLeak.showBug();
        assertNotNull("FileInputStream should not be null // TRIGGER BUG: Custom resources should be closed", fis);
    }
}