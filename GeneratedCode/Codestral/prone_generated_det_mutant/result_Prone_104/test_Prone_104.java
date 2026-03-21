import org.junit.Test;
import static org.junit.Assert.*;

public class MathRoundIntLongBugTest {

    @Test
    public void testShowBug() {
        MathRoundIntLongBug bugClass = new MathRoundIntLongBug();
        long largeNumber = 2147483648L; // This number cannot be represented accurately by float
        int result = bugClass.showBug(largeNumber);
        assertEquals("Bug triggered due to inaccurate representation of large number in float",
                (int)largeNumber, result); // TRIGGER BUG: MathRoundIntLong
    }
}