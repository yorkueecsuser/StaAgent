import org.junit.Test;
import static org.junit.Assert.*;
import java.time.Duration;
import java.time.Period;

public class PeriodTimeMathBugTest {
    @Test
    public void testShowBug() {
        Period period = Period.ofYears(1);
        Duration duration = Duration.ofDays(1);
        PeriodTimeMathBug bug = new PeriodTimeMathBug();
        // TRIGGER BUG: PeriodTimeMath
        Period result = bug.showBug(period, duration);
        // Since the code should throw a DateTimeException, this line should not be reached.
        // If it is reached, the test will fail.
        fail("Expected DateTimeException was not thrown");
    }
}