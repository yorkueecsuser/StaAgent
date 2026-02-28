import org.junit.Test;
import static org.junit.Assert.*;
import java.text.SimpleDateFormat;
import java.util.Date;

class BuggyDateFormatTest {
    @Test
    public void testBuggyDateFormat() {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);
        assertEquals("2015/12/31", result);
    }
}