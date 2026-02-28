import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    public void testShowBug() {
        BuggyCode buggyCode = new BuggyCode();
        buggyCode.showBug(); // TRIGGER BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
    }
}