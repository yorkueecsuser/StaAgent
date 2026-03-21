import org.junit.Test;
import static org.junit.Assert.*;

public class BugClassTest {

    @Test
    // TRIGGER BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT)
    public void testShowBug() {
        // Initialization
        BugClass bugClass = new BugClass();

        // This test will fail intentionally to demonstrate the bug
        assertNull(bugClass.showBug());
    }
}