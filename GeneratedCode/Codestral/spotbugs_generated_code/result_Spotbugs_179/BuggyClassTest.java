import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {
    @Test
    public void testModifyMutableObject() {
        String initialValue = BuggyClass.showBug();
        BuggyClass.modifyMutableObject("New Value");
        // TRIGGER BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)
        assertEquals("New Value", initialValue);
    }
}