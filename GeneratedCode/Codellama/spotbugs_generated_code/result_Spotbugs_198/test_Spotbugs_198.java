import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyExampleTest {
    @Test
    public void testBug() {
        BuggyExample buggyExample = new BuggyExample();
        String input = "abc";
        
        // TRIGGER BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
        String result = buggyExample.showBug(input);
        
        assertEquals("Invalid input", result);
    }
}