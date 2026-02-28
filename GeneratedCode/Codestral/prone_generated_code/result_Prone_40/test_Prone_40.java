import org.junit.Test;
import static org.junit.Assert.*;
import java.time.Period;
import java.time.Duration;

public class DurationFromBugTest {
    @Test
    public void testShowBug2() {
        DurationFromBug bug = new DurationFromBug();
        Period period = Period.ofDays(10);
        bug.showBug2(period); // TRIGGER BUG: DurationFrom
    }
}