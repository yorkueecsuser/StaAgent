import org.junit.Test;
import static org.junit.Assert.*;

public class UnnecessaryCaseChangeBugTest {
    @Test
    public void testShowBug() {
        UnnecessaryCaseChangeBug buggyClass = new UnnecessaryCaseChangeBug();
        // TRIGGER BUG: UnnecessaryCaseChange
        assertFalse(buggyClass.showBug("baz")); // Expecting false, but the buggy code will return true
    }

    @Test
    public void testShowAnotherBug() {
        UnnecessaryCaseChangeBug buggyClass = new UnnecessaryCaseChangeBug();
        // TRIGGER BUG: UnnecessaryCaseChange
        assertFalse(buggyClass.showAnotherBug("baz")); // Expecting false, but the buggy code will return true
    }
}