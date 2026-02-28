import static org.junit.Assert.*;

import org.junit.Test;

import java.time.Duration;
import java.time.Period;

public class PeriodFromBugTest {
    @Test
    public void testShowBug() {
        Period period = Period.ofDays(30);
        Duration duration = Duration.ofDays(30);
        PeriodFromBug bug = new PeriodFromBug();

        // TRIGGER BUG: PeriodFrom
        bug.showBug(period, duration); //This line will trigger the bug, as it tries to convert duration to period
    }
}