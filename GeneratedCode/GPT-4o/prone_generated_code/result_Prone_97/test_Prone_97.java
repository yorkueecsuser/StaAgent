import org.junit.Test;
import static org.junit.Assert.*;

public class JodaTimeBugDemoTest {

    @Test
    public void testShowBug() {
        JodaTimeBugDemo.DateTime dateTime = new JodaTimeBugDemo.DateTime();
        JodaTimeBugDemo.Duration duration = new JodaTimeBugDemo.Duration();
        JodaTimeBugDemo.Instant instant = new JodaTimeBugDemo.Instant();
        JodaTimeBugDemo.Interval interval = new JodaTimeBugDemo.Interval();
        JodaTimeBugDemo.Period period = new JodaTimeBugDemo.Period();

        JodaTimeBugDemo demo = new JodaTimeBugDemo();

        // The following lines will trigger the bug because they use methods that are redundant
        demo.showBug(dateTime, duration, instant, interval, period); // TRIGGER BUG: JodaToSelf
        fail("The bug JodaToSelf should not allow redundant method calls but it is being called."); 
    }
}