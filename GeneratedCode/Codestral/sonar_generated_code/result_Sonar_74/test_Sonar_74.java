import org.junit.Test;
import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ResourceLeakTest {
    @Test
    public void testShowBug() throws FileNotFoundException, IOException {
        ResourceLeak resourceLeak = new ResourceLeak();
        resourceLeak.showBug("fileName"); // TRIGGER BUG: Custom resources should be closed
    }
}