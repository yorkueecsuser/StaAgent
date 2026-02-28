import org.junit.Test;
import static org.junit.Assert.*;

public class BlockingOperationExampleTest {

    @Test
    public void testShowBug() {
        BlockingOperationExample example = new BlockingOperationExample();
        String result = example.showBug(); // TRIGGER BUG: Virtual threads should be used for tasks that include heavy blocking operations
        assertEquals("Expected result does not match", "Check console for response", result);
    }
}