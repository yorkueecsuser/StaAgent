import org.junit.Test;
import static org.junit.Assert.*;
import java.time.Duration;
import java.time.Period;

public class PeriodFromBugTest {

    @Test(expected = RuntimeException.class)
    public void testShowBugWithDuration() {
        PeriodFromBug bug = new PeriodFromBug();
        bug.showBug(Duration.ofDays(10)); // TRIGGER BUG: PeriodFrom
    }
}