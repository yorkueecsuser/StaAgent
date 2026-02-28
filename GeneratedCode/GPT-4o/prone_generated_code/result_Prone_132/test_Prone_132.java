import org.junit.Test;
import static org.junit.Assert.*;

import java.time.Duration;
import java.time.Period;
import java.time.DateTimeException;

public class PeriodFromBugExampleTest {

    @Test
    public void testShowBugWithDuration() {
        // This test case is expected to trigger a DateTimeException
        // TRIGGER BUG: PeriodFrom
        PeriodFromBugExample.showBugWithDuration();
    }

    @Test
    public void testShowBugWithPeriod() {
        // This test case will pass because Period.from(Period) returns itself
        Period expected = Period.ofDays(5);
        // TRIGGER BUG: PeriodFrom
        Period result = PeriodFromBugExample.showBugWithPeriod();
        assertEquals(expected, result);
    }
}