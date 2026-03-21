import org.junit.Test;
import static org.junit.Assert.*;

public class UselessStringValueOfBugTest {
    @Test
    public void testConvert() {
        UselessStringValueOfBug uselessStringValueOfBug = new UselessStringValueOfBug();
        // TRIGGER BUG: UselessStringValueOf - This line triggers the bug
        assertEquals("a1", uselessStringValueOfBug.showBug(1));
        // The test should fail as the bug causes the string to be "a1.0" instead of "a1"
    }
}