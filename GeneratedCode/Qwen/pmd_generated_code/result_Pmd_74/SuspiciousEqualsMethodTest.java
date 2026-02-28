import org.junit.Test;
import static org.junit.Assert.*;

public class SuspiciousEqualsMethodTest {

    @Test
    public void testSuspiciousEqualsMethod() {
        SuspiciousEqualsMethod obj = new SuspiciousEqualsMethod();
        assertEquals("false", obj.showBug("test")); // TRIGGER BUG: SuspiciousEqualsMethodName
    }

    @Test
    public void testSuspiciousEqualsMethodWithNull() {
        SuspiciousEqualsMethod obj = new SuspiciousEqualsMethod();
        assertEquals("false", obj.showBug(null)); // TRIGGER BUG: SuspiciousEqualsMethodName
    }
}