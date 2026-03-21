import org.junit.Test;
import static org.junit.Assert.*;

public class UnwrittenFieldBugTest {

    @Test
    public void testShowBug() {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        assertEquals("Test failed: Bug not triggered", 0, bug.showBug()); // TRIGGER BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
    }
}