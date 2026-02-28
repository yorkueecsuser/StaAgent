import org.junit.Test;
import static org.junit.Assert.*;
import java.time.Duration;
import java.time.Period;

public class PeriodFromBugTest {

    @Test
    public void testShowBug1() {
        PeriodFromBug bugDemo = new PeriodFromBug();
        Period period = Period.ofDays(10);
        Period result = bugDemo.showBug1(period); // TRIGGER BUG: PeriodFrom
        assertEquals("P10D", result.toString());
    }

    @Test
    public void testShowBug2() {
        PeriodFromBug bugDemo = new PeriodFromBug();
        Duration duration = Duration.ofHours(5);
        bugDemo.showBug2(duration); // TRIGGER BUG: PeriodFrom
    }

    @Test
    public void testShowBug() {
        PeriodFromBug bugDemo = new PeriodFromBug();
        String result = bugDemo.showBug(); // TRIGGER BUG: PeriodFrom
        assertTrue(result.contains("Result of Period.from(Period): P10D"));
        assertTrue(result.contains("Caught DateTimeException as expected: "));
    }
}