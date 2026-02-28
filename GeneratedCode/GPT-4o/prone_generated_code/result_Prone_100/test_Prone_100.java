import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.time.Duration;

public class LocalDatePlusDurationExampleTest {

    @Test
    public void testShowBugWithDuration() {
        LocalDatePlusDurationExample example = new LocalDatePlusDurationExample();
        LocalDate today = LocalDate.now();
        long daysToAdd = 5;
        LocalDate result = example.showBug(today, daysToAdd); // TRIGGER BUG: LocalDateTemporalAmount
        assertNotNull(result);
    }

    @Test
    public void testShowBugWithNegativeDuration() {
        LocalDatePlusDurationExample example = new LocalDatePlusDurationExample();
        LocalDate today = LocalDate.now();
        long daysToAdd = -5;
        LocalDate result = example.showBug(today, daysToAdd); // TRIGGER BUG: LocalDateTemporalAmount
        assertNotNull(result);
    }
}