import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBoundaryBugExampleTest {

    @Test
    public void testShowBug() {
        RegexBoundaryBugExample example = new RegexBoundaryBugExample();
        String result = example.showBug("exampletext"); // TRIGGER BUG: Regex boundaries should not be used in a way that can never be matched
        assertEquals("Match found: exampletext", result); // This assertion is expected to fail
    }
}