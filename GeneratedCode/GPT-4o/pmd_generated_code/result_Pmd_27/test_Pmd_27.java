import org.junit.Test;
import static org.junit.Assert.*;

public class ResourceLeakExampleTest {

    @Test
    public void testShowBug1() {
        ResourceLeakExample example = new ResourceLeakExample();
        example.showBug1(); // TRIGGER BUG: CloseResource
        // Since the connection is not closed, this should lead to a resource leak.
        // The bug is that the connection is not being closed properly in the finally block.
    }

    @Test
    public void testShowBug2() {
        ResourceLeakExample example = new ResourceLeakExample();
        example.showBug2(); // TRIGGER BUG: CloseResource
        // Since the InputStream is not closed, this should lead to a resource leak.
        // The bug is that the InputStream is not being closed properly in the finally block.
    }
}