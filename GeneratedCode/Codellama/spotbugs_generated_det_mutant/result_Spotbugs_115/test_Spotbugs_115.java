import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class ICAST_INT_2_LONG_AS_INSTANTTest {
    @Test
    public void testBug() {
        int seconds = 100;
        Date date = getDate(seconds);
        assertEquals("1970-01-01 00:00:00", date.toString()); // TRIGGER BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
    }

    public static Date getDate(int seconds) {
        return new Date(seconds * 1000L); // BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
    }
}