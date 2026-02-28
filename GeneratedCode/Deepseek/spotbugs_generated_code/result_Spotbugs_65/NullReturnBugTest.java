import org.junit.Test;
import static org.junit.Assert.*;

public class NullReturnBugTest {
    @Test
    public void testShowBug() {
        NullReturnBug bug = new NullReturnBug();
        String result = bug.showBug();
        assertNotNull("Trigger Bug: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)", result);
    }
}