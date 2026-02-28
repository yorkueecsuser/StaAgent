import org.junit.Test;
import static org.junit.Assert.*;

public class RegexGraphemeClusterDemoTest {

    @Test
    public void testShowBug() {
        RegexGraphemeClusterDemo demo = new RegexGraphemeClusterDemo();
        String result = demo.showBug("cc̈d̈d"); // TRIGGER BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        assertEquals("cXXd", result); // TRIGGER BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    }
}