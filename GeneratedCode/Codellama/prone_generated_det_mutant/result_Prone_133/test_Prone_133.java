import org.junit.Test;
import static org.junit.Assert.*;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodGetTemporalUnitBugTest {
    @Test
    public void showBugTest() {
        Period period = Period.of(1, 2, 3);

        // TRIGGER BUG: PeriodGetTemporalUnit
        long years = period.get(ChronoUnit.YEARS);
        long months = period.get(ChronoUnit.MONTHS);
        long days = period.get(ChronoUnit.DAYS);

        // Verify that the test fails
        assertEquals(0, years);
        assertEquals(0, months);
        assertEquals(0, days);
    }
}