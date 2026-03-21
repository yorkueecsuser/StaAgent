import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class ResourceLeakTest {

    @Test
    public void testResourceLeak() throws IOException {
        ResourceLeak leakyResource = new ResourceLeak();
        leakyResource.showBug("file_that_does_not_exist.txt"); // TRIGGER BUG: Resources should be closed, FileNotFoundException is expected
    }
}