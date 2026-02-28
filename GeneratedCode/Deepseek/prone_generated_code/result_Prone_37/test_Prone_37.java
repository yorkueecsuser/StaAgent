import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class DoubleBraceInitializationBugTest {

    @Test
    public void testCompileSuccessfully() {
        // This test would compile successfully without any errors
    }

    @Test
    public void testDoubleBraceInitialization() {
        List<String> list = new ArrayList<>() {
            {
                add("Denmark");
                add("Norway");
                add("Sweden");
            }
        };
        assertNotNull(list); // This test case should fail and trigger the bug
    }

    // TRIGGER BUG: DoubleBraceInitialization
    // The bug is caused by the double brace initialization pattern in the non-static context.
}