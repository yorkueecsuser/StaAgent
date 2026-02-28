import org.junit.Test;
import static org.junit.Assert.*;

public class DatePatternBugTest {

    @Test
    public void testShowBug() {
        DatePatternBug bugDemo = new DatePatternBug();
        String formattedDate = bugDemo.showBug(); // TRIGGER BUG: MisusedDayOfYear
        // The test will fail because the date pattern "MM/DD/yyyy" is incorrect and leads to invalid dates.
        assertFalse("The date pattern 'MM/DD/yyyy' should not produce valid dates", formattedDate.matches("\\d{2}/\\d{2}/\\d{4}"));
    }
}