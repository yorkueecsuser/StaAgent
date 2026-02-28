import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class AbsoluteTimeBugDemoTest {

    @Test
    public void testShowBugWithMaxInt() {
        AbsoluteTimeBugDemo demo = new AbsoluteTimeBugDemo();
        Date date = demo.showBug(2147483647); // TRIGGER BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
        assertNull("Date should be null due to overflow bug", date);
    }

    @Test
    public void testShowBugWithPositiveInt() {
        AbsoluteTimeBugDemo demo = new AbsoluteTimeBugDemo();
        Date date = demo.showBug(1000000000); // TRIGGER BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
        assertNull("Date should be null due to overflow bug", date);
    }
}