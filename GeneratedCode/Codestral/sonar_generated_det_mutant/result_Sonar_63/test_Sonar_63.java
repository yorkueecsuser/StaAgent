import org.junit.Test;
import static org.junit.Assert.*;
import java.text.ParseException;

public class WeekYearBugTest {
    @Test
    public void testShowBug() throws ParseException {
        WeekYearBug bugDemo = new WeekYearBug();
        assertEquals("2015/12/31", bugDemo.showBug()); // TRIGGER BUG: Week Year ("YYYY") should not be used for date formatting
    }
}