import org.junit.Test;
import static org.junit.Assert.*;

public class ResourceLeakExampleTest {

    @Test
    public void testShowBug() {
        ResourceLeakExample example = new ResourceLeakExample();
        String result = example.showBug(); // TRIGGER BUG: Custom resources should be closed
        assertEquals("Resource used without closing.", result); // TRIGGER BUG: Custom resources should be closed
    }
}