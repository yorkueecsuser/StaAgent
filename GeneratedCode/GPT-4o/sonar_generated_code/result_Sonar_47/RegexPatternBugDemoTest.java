import org.junit.Test;
import static org.junit.Assert.*;

public class RegexPatternBugDemoTest {

    @Test
    public void testShowBugWithEmptyString() {
        String input = "";
        String output = RegexPatternBugDemo.showBug(input);
        
        // Check the first pattern
        assertTrue(output.contains("Pattern: \"(?:)*\" matches \"\"")); // TRIGGER BUG: Repeated patterns in regular expressions should not match the empty string

        // Check the second pattern
        assertTrue(output.contains("Pattern: \"(?:|x)*\" matches \"\"")); // TRIGGER BUG: Repeated patterns in regular expressions should not match the empty string

        // Check the third pattern
        assertTrue(output.contains("Pattern: \"(?:x|)*\" matches \"\"")); // TRIGGER BUG: Repeated patterns in regular expressions should not match the empty string

        // Check the fourth pattern
        assertTrue(output.contains("Pattern: \"(?:x*|y*)*\" matches \"\"")); // TRIGGER BUG: Repeated patterns in regular expressions should not match the empty string

        // Check the fifth pattern
        assertTrue(output.contains("Pattern: \"(?:x?)*\" matches \"\"")); // TRIGGER BUG: Repeated patterns in regular expressions should not match the empty string

        // Check the sixth pattern
        assertTrue(output.contains("Pattern: \"(?:x?)+\" matches \"\"")); // TRIGGER BUG: Repeated patterns in regular expressions should not match the empty string
    }
}