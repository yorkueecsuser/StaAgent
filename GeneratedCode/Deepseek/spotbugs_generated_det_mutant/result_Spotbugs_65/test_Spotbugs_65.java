import org.junit.Test;
import static org.junit.Assert.*;

public class BugCodeTest {

    @Test
    public void testShowBug() {
        BugCode bugCode = new BugCode();
        Integer result = bugCode.showBug();
        // TRIGGER BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
        assertNotNull(result); 
    }
}