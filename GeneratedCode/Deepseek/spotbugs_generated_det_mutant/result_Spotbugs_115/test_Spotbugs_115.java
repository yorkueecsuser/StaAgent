import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.*;

public class ICAST_INT_2_LONG_AS_INSTANTTest {
    @Test
    public void testShowBug() {
        ICAST_INT_2_LONG_AS_INSTANT icast = new ICAST_INT_2_LONG_AS_INSTANT();
        int seconds = 1000000000;  // A date far in the future
        long milliseconds = icast.showBug(seconds);
        Date date = new Date(milliseconds);
        // TRIGGER BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
        assertTrue(date.getTime()!= milliseconds);
    }
}