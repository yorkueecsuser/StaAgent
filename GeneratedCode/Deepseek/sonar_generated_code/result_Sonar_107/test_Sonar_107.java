import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    BuggyCode bc = new BuggyCode();

    @Test
    public void testShowBug() {
        try {
            bc.showBug();
        } catch (Exception e) {
            // Expected exception is java.util.IllegalFormatConversionException
            assertEquals(java.util.IllegalFormatConversionException.class, e.getClass());
        }
        
        // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }
}