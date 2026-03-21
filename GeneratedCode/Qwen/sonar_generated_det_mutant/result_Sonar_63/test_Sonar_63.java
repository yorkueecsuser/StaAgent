import org.junit.Test;
import static org.junit.Assert.*;

public class DateFormattingBugTest {

    @Test
    public void testShowBugWithLastDayOfDecember() throws Exception {
        DateFormattingBug bugDemo = new DateFormattingBug();
        String result = bugDemo.showBug("2015/12/31"); // TRIGGER BUG: Week Year ("YYYY") should not be used for date formatting
        assertEquals("2015/12/31", result); // This assertion will fail, triggering the bug
    }

    @Test
    public void testShowBugWithDateTimeFormatterLastDayOfDecember() {
        DateFormattingBug bugDemo = new DateFormattingBug();
        String result = bugDemo.showBugWithDateTimeFormatter("2015/12/31"); // TRIGGER BUG: Week Year ("YYYY") should not be used for date formatting
        assertEquals("2015/12/31", result); // This assertion will fail, triggering the bug
    }

    @Test
    public void testShowBugWithFirstDayOfJanuary() throws Exception {
        DateFormattingBug bugDemo = new DateFormattingBug();
        String result = bugDemo.showBug("2016/01/01"); // TRIGGER BUG: Week Year ("YYYY") should not be used for date formatting
        assertEquals("2016/01/01", result); // This assertion will fail, triggering the bug
    }

    @Test
    public void testShowBugWithDateTimeFormatterFirstDayOfJanuary() {
        DateFormattingBug bugDemo = new DateFormattingBug();
        String result = bugDemo.showBugWithDateTimeFormatter("2016/01/01"); // TRIGGER BUG: Week Year ("YYYY") should not be used for date formatting
        assertEquals("2016/01/01", result); // This assertion will fail, triggering the bug
    }
}