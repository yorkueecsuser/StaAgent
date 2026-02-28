import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeBugTest {
    @Test
    public void testShowBug() {
        FinalizeBug buggyObject = new FinalizeBug();
        buggyObject.showBug(); // TRIGGER BUG: The signature of "finalize()" should match that of "Object.finalize()"
        assertTrue(false); // This test case will always fail to trigger the bug
    }
}