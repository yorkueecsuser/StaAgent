import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Optional; // Essential import added

public class OptionalBugDemoTest {

    @Test
    public void testShowBugReturnsNull() {
        OptionalBugDemo demo = new OptionalBugDemo();
        Optional<String> result = demo.showBug(true); // TRIGGER BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        assertNotNull("The result should not be null, but was.", result); // This will fail when the bug is triggered
    }
}