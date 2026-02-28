import org.junit.Test;
import static org.junit.Assert.*;

public class ImplicitSwitchFallThroughBugTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: ImplicitSwitchFallThrough
        assertEquals("New, Removed, Error", ImplicitSwitchFallThroughBug.showBug(2));
        assertEquals("Removed, Error", ImplicitSwitchFallThroughBug.showBug(3));
        assertEquals("Error", ImplicitSwitchFallThroughBug.showBug(4));
        assertEquals("Cancelled, New, Removed, Error", ImplicitSwitchFallThroughBug.showBug(1));
    }
}