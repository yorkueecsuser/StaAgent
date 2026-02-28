import org.junit.Test;
import static org.junit.Assert.*;

public class RedundantRegexAlternativesTest {
    @Test
    public void testRedundantAlternative() {
        RedundantRegexAlternatives obj = new RedundantRegexAlternatives();

        // TRIGGER BUG: Redundant alternative 'a' in the regex '[ab]|a'
        assertFalse("Input 'a' should not match", obj.checkRedundantAlternative("a"));
        assertTrue("Input 'b' should match", obj.checkRedundantAlternative("b"));
        assertFalse("Input 'c' should not match", obj.checkRedundantAlternative("c"));
    }
}