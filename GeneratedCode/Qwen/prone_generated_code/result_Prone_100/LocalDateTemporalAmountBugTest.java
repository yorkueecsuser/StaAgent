import java.time.LocalDate;
import java.time.Duration;
import org.junit.Test;
import static org.junit.Assert.*;

public class LocalDateTemporalAmountBugTest {

    @Test(expected = java.time.temporal.UnsupportedTemporalTypeException.class)
    public void testShowBugWithDuration() {
        LocalDateTemporalAmountBug bugDemo = new LocalDateTemporalAmountBug();
        LocalDate date = LocalDate.now();
        Duration duration = Duration.ofDays(10);
        bugDemo.showBug(date, duration); // TRIGGER BUG: LocalDateTemporalAmount
    }
}