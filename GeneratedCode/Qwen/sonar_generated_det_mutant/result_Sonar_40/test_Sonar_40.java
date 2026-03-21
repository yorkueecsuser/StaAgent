import org.junit.Test;
import static org.junit.Assert.*;

public class RegexGraphemeClusterBugTest {

    @Test
    public void testShowBug() {
        RegexGraphemeClusterBug bugDemo = new RegexGraphemeClusterBug();
        assertEquals("cXXd", bugDemo.showBug("cc̈d̈d")); // TRIGGER BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    }
}