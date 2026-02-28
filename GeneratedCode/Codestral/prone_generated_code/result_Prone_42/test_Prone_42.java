import org.junit.Test;
import static org.junit.Assert.*;
import java.time.temporal.ChronoUnit;
import java.time.DateTimeException;

public class DurationTemporalUnitBugTest {
    @Test(expected = DateTimeException.class)
    public void testShowBug() {
        DurationTemporalUnitBug bug = new DurationTemporalUnitBug();
        bug.showBug(1, ChronoUnit.YEARS); // TRIGGER BUG: DurationTemporalUnit
    }
}