import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.DateTimeException;

public class TemporalAccessorBugExampleTest {

    @Test
    public void testShowBug() {
        TemporalAccessorBugExample example = new TemporalAccessorBugExample();
        Month month = Month.JANUARY;

        // Attempting to trigger the bug by calling showBug with a Month instance
        // This should throw a DateTimeException and thus fail the test
        LocalDate result = example.showBug(month); // TRIGGER BUG: FromTemporalAccessor

        // This assertion is expected to fail due to the bug
        assertNotNull("The result should not be null", result); // TRIGGER BUG: FromTemporalAccessor
    }
}