import org.junit.Test;
import static org.junit.Assert.*;

public class SuspiciousEqualsMethodNameTest {
    // TRIGGER BUG: SuspiciousEqualsMethodName
    @Test
    public void testSuspiciousEqualsMethodName() {
        SuspiciousEqualsMethodName test = new SuspiciousEqualsMethodName();
        test.showBug(); // This line triggers the bug
    }
}