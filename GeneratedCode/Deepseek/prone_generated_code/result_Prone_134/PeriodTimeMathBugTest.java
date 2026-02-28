import org.junit.Test;
import static org.junit.Assert.*;
import java.time.Period;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PeriodTimeMathBugTest {
    private PeriodTimeMathBug buggyClass = new PeriodTimeMathBug();

    @Test
    // TRIGGER BUG: PeriodTimeMath
    public void testPeriodTimeMathBug() {
        buggyClass.showBug();  // line 8
    }
}