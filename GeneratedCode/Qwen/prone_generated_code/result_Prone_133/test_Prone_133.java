import org.junit.Test;
import static org.junit.Assert.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

public class PeriodGetTemporalUnitExampleTest {

    @Test
    public void testShowBugWithYears() {
        PeriodGetTemporalUnitExample example = new PeriodGetTemporalUnitExample();
        assertEquals(2, example.showBug(ChronoUnit.YEARS));
    }

    @Test
    public void testShowBugWithMonths() {
        PeriodGetTemporalUnitExample example = new PeriodGetTemporalUnitExample();
        assertEquals(3, example.showBug(ChronoUnit.MONTHS));
    }

    @Test
    public void testShowBugWithDays() {
        PeriodGetTemporalUnitExample example = new PeriodGetTemporalUnitExample();
        assertEquals(4, example.showBug(ChronoUnit.DAYS));
    }

    @Test(expected = UnsupportedTemporalTypeException.class)
    public void testShowBugWithHours() {
        PeriodGetTemporalUnitExample example = new PeriodGetTemporalUnitExample();
        example.showBug(ChronoUnit.HOURS); // TRIGGER BUG: PeriodGetTemporalUnit
    }
}