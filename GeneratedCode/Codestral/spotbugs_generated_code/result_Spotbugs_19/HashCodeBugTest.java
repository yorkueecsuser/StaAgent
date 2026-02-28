import org.junit.Test;
import static org.junit.Assert.*;

public class HashCodeBugTest {

    @Test
    public void showBugTest() {
        HashCodeBug buggyCode = new HashCodeBug();
        int result = buggyCode.showBug("DESIGNING WORKHOUSES"); // TRIGGER BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        assertEquals("The bug should not return negative value", false, result < 0);
    }
}