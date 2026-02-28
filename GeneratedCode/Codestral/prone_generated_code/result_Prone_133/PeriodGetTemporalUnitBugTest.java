import org.junit.Test;
import static org.junit.Assert.*;
import java.time.Period;
import java.time.temporal.UnsupportedTemporalTypeException;

public class PeriodGetTemporalUnitBugTest {
    @Test(expected = UnsupportedTemporalTypeException.class)
    public void testShowBug() {
        PeriodGetTemporalUnitBug buggyClass = new PeriodGetTemporalUnitBug();
        Period period = Period.of(1, 2, 3);
        buggyClass.showBug(period); // TRIGGER BUG: PeriodGetTemporalUnit
    }
}