import org.junit.Test;
import static org.junit.Assert.*;

public class StringComparisonTest {

    @Test
    public void testShowBug() {
        StringComparison sc = new StringComparison();
        assertFalse(sc.showBug("baz")); // TRIGGER BUG: UnnecessaryCaseChange
    }

    @Test
    public void testShowBug2() {
        StringComparison sc = new StringComparison();
        assertFalse(sc.showBug2("baz")); // TRIGGER BUG: UnnecessaryCaseChange
    }
}