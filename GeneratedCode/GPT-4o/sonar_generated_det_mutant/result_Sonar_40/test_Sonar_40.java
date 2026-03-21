import org.junit.Test;
import static org.junit.Assert.*;

public class RegexUnicodeBugExampleTest {

    @Test
    public void testShowBug() {
        RegexUnicodeBugExample example = new RegexUnicodeBugExample();
        String result = example.showBug("cc̈d̈d"); // TRIGGER BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        assertEquals("cXXd", result); // Expectation will fail because of the bug
    }
}