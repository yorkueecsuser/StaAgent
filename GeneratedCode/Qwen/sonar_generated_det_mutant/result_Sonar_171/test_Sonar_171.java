import org.junit.Test;
import static org.junit.Assert.*;

public class FinallyBlockBugTest {

    @Test
    public void testShowBug() {
        FinallyBlockBug bugDemo = new FinallyBlockBug();
        assertEquals("ERROR", bugDemo.showBug()); // TRIGGER BUG: Jump statements should not occur in "finally" blocks
    }
}