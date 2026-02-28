import org.junit.Test;
import static org.junit.Assert.*;

public class ResourceLeakExampleTest {

    @Test
    public void testShowBugResourceLeak() {
        ResourceLeakExample example = new ResourceLeakExample();
        String result = example.showBug(); // TRIGGER BUG: Custom resources should be closed
        assertEquals("Resource processed but not closed.", result); // This assertion aims to fail to indicate the bug
    }
}