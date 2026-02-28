import org.junit.Test;
import static org.junit.Assert.*;

public class HashcodeExampleTest {

    @Test
    public void testShowBug() {
        HashcodeExample example = new HashcodeExample();
        int result = example.showBug(); // TRIGGER BUG: SuspiciousHashcodeMethodName
        assertEquals(0, result); // Expecting 0 to fail intentionally // TRIGGER BUG: SuspiciousHashcodeMethodName
    }
}