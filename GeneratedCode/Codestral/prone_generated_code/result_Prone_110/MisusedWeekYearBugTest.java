import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MisusedWeekYearBugTest {

    @Test
    public void showBugTest() {
        // Create a date for December 31, 2014
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2014);
        cal.set(Calendar.MONTH, Calendar.DECEMBER);
        cal.set(Calendar.DAY_OF_MONTH, 31);
        Date date = cal.getTime();

        MisusedWeekYearBug bugInstance = new MisusedWeekYearBug();
        String result = bugInstance.showBug(date);

        // Check the result with the expected value '2014'
        // But due to the bug, it might return '2015', causing the test to fail
        // TRIGGER BUG: MisusedWeekYear
        assertEquals("2014", result);
    }
}