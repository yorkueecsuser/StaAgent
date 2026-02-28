import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.DateTimeException;

public class FromTemporalAccessorBugTest {

    @Test
    public void testShowBug() {
        FromTemporalAccessorBug bugDemo = new FromTemporalAccessorBug();
        LocalDate date = LocalDate.of(2023, 10, 5);
        Month month = bugDemo.showBug(date);
        assertEquals(Month.OCTOBER, month);
    }

    @Test(expected = DateTimeException.class)
    public void testShowBug1() {
        FromTemporalAccessorBug bugDemo = new FromTemporalAccessorBug();
        Month month = Month.OCTOBER;
        LocalDate date = bugDemo.showBug1(month); // TRIGGER BUG: FromTemporalAccessor
        assertNotNull(date);
    }
}