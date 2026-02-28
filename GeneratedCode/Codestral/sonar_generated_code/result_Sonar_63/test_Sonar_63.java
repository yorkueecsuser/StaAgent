import org.junit.Test;
import static org.junit.Assert.*;
import java.text.ParseException;

public class WeekYearBugTest {
    @Test
    public void testShowBug() throws Exception {
        WeekYearBug bug = new WeekYearBug();
        String result = bug.showBug();
        assertEquals("2015/12/31", result); // TRIGGER BUG: Week Year ("YYYY") should not be used for date formatting
    }
}