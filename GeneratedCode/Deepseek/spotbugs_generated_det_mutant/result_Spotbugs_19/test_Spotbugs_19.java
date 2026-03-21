import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class HashCodeBugTest {

    @Test
    public void testShowBug() {
        HashCodeBug bug = new HashCodeBug();
        List<Integer> result1 = bug.showBug("polygenelubricants"); // TRIGGER BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        assertEquals(-867680977, result1.get(0).intValue()); // Expected: -867680977
        assertEquals(867680977, result1.get(1).intValue()); // Expected: 867680977

        List<Integer> result2 = bug.showBug("GydZG_"); // TRIGGER BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        assertEquals(-1888068063, result2.get(0).intValue()); // Expected: -1888068063
        assertEquals(1888068063, result2.get(1).intValue()); // Expected: 1888068063

        List<Integer> result3 = bug.showBug("DESIGNING WORKHOUSES"); // TRIGGER BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        assertEquals(-1422768570, result3.get(0).intValue()); // Expected: -1422768570
        assertEquals(1422768570, result3.get(1).intValue()); // Expected: 1422768570
    }
}