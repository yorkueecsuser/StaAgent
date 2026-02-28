import org.junit.Test;
import static org.junit.Assert.*;

public class UnicodeGraphemeClustersBugTest {

    @Test
    public void testShowBug() {
        UnicodeGraphemeClustersBug bug = new UnicodeGraphemeClustersBug();
        String result = bug.showBug("cc̈d̈d");
        assertEquals("cXXd", result); // TRIGGER BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    }
}