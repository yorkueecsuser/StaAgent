import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    public void testShowBug() {
        BuggyCode buggyCode = new BuggyCode("test");
        // TRIGGER BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
        assertFalse(buggyCode.showBug()); // Expected output: false, but actual output is: true
    }
}