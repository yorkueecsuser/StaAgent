import org.junit.Test;
import static org.junit.Assert.*;

public class SelfEqualsBugTest {

    @Test
    public void testShowBug() {
        SelfEqualsBug bug = new SelfEqualsBug("Bug");
        assertTrue("Bug triggered: object equals itself", bug.showBug()); // TRIGGER BUG: SelfEquals
    }
}