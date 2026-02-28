import org.junit.Test;
import static org.junit.Assert.*;
import java.text.SimpleDateFormat;
import java.util.Date;

class SimpleDateFormatBugTest {
    @Test
    public void testFormatDate() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = format.format(date);
        assertEquals("2023-02-20 15:45:30", formattedDate); // TRIGGER BUG: SimpleDateFormatNeedsLocale
    }
}