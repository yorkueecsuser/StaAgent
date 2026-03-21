import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    // TRIGGER BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    public void testShowBug() {
        String result = Main.showBug();
        assertEquals("cXXd", result); // This line will fail because the code is not compliant
    }
}