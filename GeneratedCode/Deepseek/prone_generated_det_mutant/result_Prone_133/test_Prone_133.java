import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class BuggyPeriodGetTemporalUnitTest {
    @Test
    public void testShowBug() {
        BuggyPeriodGetTemporalUnit buggyPeriodGetTemporalUnit = new BuggyPeriodGetTemporalUnit();
        buggyPeriodGetTemporalUnit.showBug(); // TRIGGER BUG: PeriodGetTemporalUnit
    }

    private class BuggyPeriodGetTemporalUnit {
        public long showBug() {
            LocalDate from = LocalDate.of(2018, 6, 15);
            LocalDate to = LocalDate.of(2019, 7, 17);
            Period period = Period.between(from, to);
            long bug = period.get(ChronoUnit.WEEKS); // BUG: PeriodGetTemporalUnit
            return bug;
        }
    }
}