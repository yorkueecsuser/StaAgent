import org.junit.Test;
import static org.junit.Assert.*;

public class FinallyBlockBugTest {

    @Test
    public void testShowBug() {
        FinallyBlockBug.showBug(); // TRIGGER BUG: Jump statements should not occur in "finally" blocks
        fail("Expected RuntimeException was not thrown."); // TRIGGER BUG: Jump statements should not occur in "finally" blocks
    }
}