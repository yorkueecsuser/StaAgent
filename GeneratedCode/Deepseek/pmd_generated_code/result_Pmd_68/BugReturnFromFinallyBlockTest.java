import org.junit.Test;
import static org.junit.Assert.*;

public class BugReturnFromFinallyBlockTest {
    private BugReturnFromFinallyBlock bugObj = new BugReturnFromFinallyBlock();

    @Test
    public void testShowBug() {
        assertEquals("A. O. K.", bugObj.showBug()); // TRIGGER BUG: ReturnFromFinallyBlock
    }
}