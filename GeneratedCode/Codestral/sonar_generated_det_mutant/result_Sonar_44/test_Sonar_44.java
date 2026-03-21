import org.junit.Test;
import static org.junit.Assert.*;

public class RedundantRegexAlternativesTest {
    @Test
    public void testShowBug() {
        RedundantRegexAlternatives redundantRegex = new RedundantRegexAlternatives();
        // TRIGGER BUG: Regex alternatives should not be redundant
        assertFalse(redundantRegex.showBug("b"));
    }
}