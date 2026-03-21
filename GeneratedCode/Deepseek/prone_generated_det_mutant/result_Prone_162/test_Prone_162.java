import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.fail;

public class BugExampleTest {
    @Test
    public void testShowBug() {
        try {
            BugExample bugExample = new BugExample();
            bugExample.showBug(); 
            fail("Expected an IOException to be thrown");
        } catch (IOException e) {
            // Test passed
        } catch (Throwable t) {
            fail("Expected IOException, but got: " + t);
        }
    }
}