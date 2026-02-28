import org.junit.Test;
import static org.junit.Assert.*;

public class RegexRedundancyExampleTest {

    @Test
    public void testShowBug() {
        RegexRedundancyExample example = new RegexRedundancyExample();
        assertTrue(example.showBug("a")); // TRIGGER BUG: Regex alternatives should not be redundant
    }

    @Test
    public void testShowBugRedundant() {
        RegexRedundancyExample example = new RegexRedundancyExample();
        assertTrue(example.showBug("b")); // TRIGGER BUG: Regex alternatives should not be redundant
    }

    @Test
    public void testShowBug2() {
        RegexRedundancyExample example = new RegexRedundancyExample();
        assertTrue(example.showBug2("anything")); // TRIGGER BUG: Regex alternatives should not be redundant
    }
}