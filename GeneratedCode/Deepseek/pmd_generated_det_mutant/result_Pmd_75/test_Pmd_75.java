import org.junit.Test;
import static org.junit.Assert.*;

public class SuspiciousHashcodeMethodNameBugTest {
    @Test
    public void testSuspiciousHashcodeMethodNameBug() {
        SuspiciousHashcodeMethodNameBug b = new SuspiciousHashcodeMethodNameBug();
        assertEquals(42, b.showBug()); // TRIGGER BUG: SuspiciousHashcodeMethodName
    }
}