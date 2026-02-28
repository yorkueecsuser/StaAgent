import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        String s = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // TRIGGER BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        assertEquals("cXXd", s);
    }
}