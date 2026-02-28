import org.junit.Test;
import static org.junit.Assert.*;

public class DateFormatBugTest {

    @Test
    public void testShowBug() throws Exception {
        DateFormatBug bugDemo = new DateFormatBug();
        String result = bugDemo.showBug();   // TRIGGER BUG: Week Year ("YYYY") should not be used for date formatting
        assertEquals("2015/12/31", result);
    }

    @Test
    public void testShowBug2() {
        DateFormatBug bugDemo = new DateFormatBug();
        String result = bugDemo.showBug2();   // TRIGGER BUG: Week Year ("YYYY") should not be used for date formatting
        assertEquals("2015/12/31", result);
    }
}