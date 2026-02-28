import org.junit.Test;
import static org.junit.Assert.*;

public class SuspiciousHashcodeMethodTest {
    @Test
    public void showBugTest() {
        SuspiciousHashcodeMethod testObject = new SuspiciousHashcodeMethod();
        // TRIGGER BUG: SuspiciousHashcodeMethodName
        assertEquals("The hashcode method did not return the expected value", 1, testObject.showBug());
    }
}