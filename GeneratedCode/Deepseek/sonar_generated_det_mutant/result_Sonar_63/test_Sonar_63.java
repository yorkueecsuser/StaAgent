import org.junit.Test;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.*;

public class WeekYearBugTest {

    @Test
    public void testShowBug() throws Exception {
        WeekYearBug bug = new WeekYearBug();
        try {
            bug.showBug(); // TRIGGER BUG: Week Year ("YYYY") should not be used for date formatting
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("Unparseable date"));
        }
    }

    class WeekYearBug {

        public void showBug() throws Exception {
            Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
            String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   //BUG: Week Year ("YYYY") should not be used for date formatting
            result = new SimpleDateFormat("YYYY/MM/dd").format(date);   //BUG: Week Year ("YYYY") should not be used for date formatting
        }
    }
}