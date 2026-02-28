import org.junit.Test;
import static org.junit.Assert.*;

public class HashCodeBugTest {
    @Test
    public void testBugTrigger() {
        HashCodeBug hashCodeBug = new HashCodeBug();
        int absoluteValue = hashCodeBug.showBug("polygenelubricants"); // TRIGGER BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        assertTrue(absoluteValue < 0);
    }
}