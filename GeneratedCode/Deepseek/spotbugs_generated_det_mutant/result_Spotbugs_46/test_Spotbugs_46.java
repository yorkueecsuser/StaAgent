import org.junit.Test;
import static org.junit.Assert.*;

public class UnwrittenFieldBugTest {

    @Test
    public void testShowBug() {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        // TRIGGER BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
        int result = bug.showBug();
        assertEquals(0, result); // The bug will always return 0. Thus, this assertion must fail.
    }
}