import org.junit.Test;
import static org.junit.Assert.*;

public class SuspiciousHashcodeMethodNameTest {
    @Test
    public void testGetHashCode() {
        assertEquals(12345, SuspiciousHashcodeMethodName.getHashCode());
        // TRIGGER BUG: SuspiciousHashcodeMethodName
    }
}