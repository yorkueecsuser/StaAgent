import org.junit.Test;
import static org.junit.Assert.*;

public class DeadExceptionBugTest {
    @Test
    public void testDeadException() {
        DeadExceptionBug buggyCode = new DeadExceptionBug();
        try {
            buggyCode.showBug();
            fail("Exception not thrown");
        } catch (IOException e) {
            assertEquals("DeadExceptionBug", e.getMessage());
        }
    }
}