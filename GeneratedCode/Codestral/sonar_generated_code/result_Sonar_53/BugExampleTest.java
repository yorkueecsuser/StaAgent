import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    @Test
    public void testShowBug() {
        BugExample example = new BugExample();
        // TRIGGER BUG: Only one method invocation is expected when testing checked exceptions
        try {
            example.g(example.f(1)); // Bug is triggered here
            fail("Expected an IOException to be thrown");
        } catch (IOException e) {
            // Test exception message...
        }
    }
}