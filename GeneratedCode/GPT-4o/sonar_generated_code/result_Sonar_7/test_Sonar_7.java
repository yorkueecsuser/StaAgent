import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.List;

public class BlockingOperationExampleTest {

    @Test
    public void testShowBug() throws IOException {
        BlockingOperationExample example = new BlockingOperationExample();
        String testUrl = "http://example.com"; // A URL to trigger the blocking operation
        List<Integer> responseCodes = example.showBug(testUrl); // TRIGGER BUG: Virtual threads should be used for tasks that include heavy blocking operations

        assertNotNull(responseCodes);
        assertFalse(responseCodes.isEmpty()); // This will fail if the blocking operation is not handled correctly
    }
}