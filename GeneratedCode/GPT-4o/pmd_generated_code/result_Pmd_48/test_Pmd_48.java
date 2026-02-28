import org.junit.Test;
import static org.junit.Assert.*;

public class SwitchFallThroughExampleTest {

    @Test
    public void testShowBugCancelled() {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        String result = example.showBug(1);
        assertEquals("Cancelled", result); // TRIGGER BUG: ImplicitSwitchFallThrough
    }

    @Test
    public void testShowBugNew() {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        String result = example.showBug(2);
        assertEquals("New", result); // TRIGGER BUG: ImplicitSwitchFallThrough
    }
}