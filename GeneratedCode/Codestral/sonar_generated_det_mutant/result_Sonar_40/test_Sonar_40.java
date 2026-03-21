import org.junit.Test;
import static org.junit.Assert.*;

public class UnicodeGraphemeClusterBugTest {
    @Test
    public void testShowBug() {
        assertEquals("cXXd", UnicodeGraphemeClusterBug.showBug("cc̈d̈d")); // TRIGGER BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    }
}