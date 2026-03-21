import org.junit.Test;
import static org.junit.Assert.*;

public class RegexRedundancyExampleTest {

    @Test
    public void testShowBug() {
        RegexRedundancyExample example = new RegexRedundancyExample();
        
        // This test will fail because the pattern "[ab]|a" is redundant.
        // TRIGGER BUG: Regex alternatives should not be redundant
        assertFalse(example.showBug("c")); // This should return false, but due to the bug, it might not behave as expected.
    }

    @Test
    public void testShowBug2() {
        RegexRedundancyExample example = new RegexRedundancyExample();
        
        // This test will fail because the pattern ".*|a" is redundant.
        // TRIGGER BUG: Regex alternatives should not be redundant
        assertFalse(example.showBug2("c")); // This should return false, but due to the bug, it might not behave as expected.
    }
}