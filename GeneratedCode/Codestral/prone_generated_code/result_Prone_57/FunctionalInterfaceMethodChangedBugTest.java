import org.junit.Test;
import static org.junit.Assert.*;

public class FunctionalInterfaceMethodChangedBugTest {

    @Test
    public void testBugTrigger() {
        assertEquals("Bar in A changed to Original Qux", FunctionalInterfaceMethodChangedBug.showBug()); // TRIGGER BUG: FunctionalInterfaceMethodChanged
    }
}