import org.junit.Test;
import static org.junit.Assert.*;

public class IntCastToFloatBugTest {

    @Test
    public void testShowBug() {
        IntCastToFloatBug bug = new IntCastToFloatBug();
        int intValue = 10;
        int result = bug.showBug(intValue);
        // TRIGGER BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
        assertNotEquals(intValue, result);
    }
}