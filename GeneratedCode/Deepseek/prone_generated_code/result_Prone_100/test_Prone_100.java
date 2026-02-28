import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateTemporalAmountTest {
    LocalDateTemporalAmount localDateTemporalAmount = new LocalDateTemporalAmount();

    @Test
    public void testShowBug() {
        LocalDate date = LocalDate.now();
        LocalDate buggyDate = localDateTemporalAmount.showBug();
        assertNotEquals(date, buggyDate); // TRIGGER BUG: LocalDateTemporalAmount
    }
}