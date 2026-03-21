import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testShowBug() {
        BugExample bugExample = new BugExample();
        assertEquals("Expected value", bugExample.showBug()); 
    }
    // TRIGGER BUG: MS: Field should be package protected (MS_PKGPROTECT)
}