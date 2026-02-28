import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

public class IcastBugExampleTest {

    @Test
    public void testShowBugWithLargeValue() {
        IcastBugExample example = new IcastBugExample();
        Date result = example.showBug(2000000000); // TRIGGER BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT) 
        // The expected date for 2000000000 seconds since epoch is 2033-05-18T03:33:20Z
        // However, due to the bug, the actual date will be incorrect
        assertFalse(result.after(new Date(2033 - 1900, 4, 18))); // This assertion will fail
    }

    @Test
    public void testShowBugWithBoundaryValue() {
        IcastBugExample example = new IcastBugExample();
        Date result = example.showBug(Integer.MAX_VALUE); // TRIGGER BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT) 
        // The expected date for Integer.MAX_VALUE seconds since epoch is beyond year 2038
        // However, due to the bug, the actual date will be incorrect
        assertFalse(result.after(new Date(2038 - 1900, 0, 19))); // This assertion will fail
    }
}