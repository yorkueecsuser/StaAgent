import org.junit.Test;
import static org.junit.Assert.*;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

public class PeriodBugExampleTest {

    @Test
    public void testShowBug() {
        PeriodBugExample example = new PeriodBugExample();
        example.showBug(); // TRIGGER BUG: PeriodGetTemporalUnit
    }
}