import org.junit.Test;
import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WeekYearBugTest {
    @Test
    public void testShowBug() throws ParseException {
        WeekYearBug bug = new WeekYearBug();
        String[] results = bug.showBug();
        assertEquals("Expected result", "2015/12/31", results[0]);  // TRIGGER BUG: Week Year ("YYYY") should not be used for date formatting
        assertEquals("Expected result", "2015/12/31", results[1]);  // TRIGGER BUG: Week Year ("YYYY") should not be used for date formatting
    }
}