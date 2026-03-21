import org.junit.Test;
import static org.junit.Assert.*;

public class HashCodeExampleTest {

    @Test
    public void testSuspiciousHashcodeMethod() {
        HashCodeExample example = new HashCodeExample();
        int result = example.showBug(); // TRIGGER BUG: SuspiciousHashcodeMethodName
        assertEquals(42, result); // This assertion will pass, but the bug is in the method called, not here.
        fail("This test is expected to fail due to the suspicious hashcode method"); // TRIGGER BUG: SuspiciousHashcodeMethodName
    }
}