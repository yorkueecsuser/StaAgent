import org.junit.Test;
import static org.junit.Assert.*;
import java.time.Duration;

public class DurationGetTemporalUnitBugTest {

    @Test
    public void testShowBug() {
        DurationGetTemporalUnitBug bug = new DurationGetTemporalUnitBug();
        Duration duration = Duration.ofSeconds(120);
        bug.showBug(duration); // TRIGGER BUG: DurationGetTemporalUnit
    }
}