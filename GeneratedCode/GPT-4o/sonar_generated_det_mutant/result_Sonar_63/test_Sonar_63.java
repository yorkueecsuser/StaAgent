import org.junit.Test;
import static org.junit.Assert.*;

public class DateFormattingBugExampleTest {

    @Test
    public void testShowBug() {
        DateFormattingBugExample example = new DateFormattingBugExample();
        String result = example.showBug(); // TRIGGER BUG: Week Year ("YYYY") should not be used for date formatting
        assertEquals("2015/12/31", result); // TRIGGER BUG: Week Year ("YYYY") should not be used for date formatting
    }
}