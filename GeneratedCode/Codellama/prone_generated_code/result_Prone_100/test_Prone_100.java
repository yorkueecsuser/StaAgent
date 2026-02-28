import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.time.Period;

public class LocalDateTemporalAmountTest {
    @Test
    public void testBug() {
        LocalDate date = LocalDate.now();
        Period period = Period.ofDays(10);

        // BUG: LocalDateTemporalAmount
        LocalDate newDate = date.plus(period);
        System.out.println(newDate);
    }
}