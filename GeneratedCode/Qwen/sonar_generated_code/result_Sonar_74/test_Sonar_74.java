import org.junit.Test;
import static org.junit.Assert.*;

public class ResourceLeakExampleTest {

    @Test
    public void testResourceLeak() {
        ResourceLeakExample example = new ResourceLeakExample();
        example.showBug("nonexistentfile.txt"); // TRIGGER BUG: Custom resources should be closed
    }
}