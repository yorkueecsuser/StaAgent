import org.junit.Test;
import static org.junit.Assert.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatterTest {

    @Test
    public void testShowBug() {
        DateFormatter formatter = new DateFormatter();
        Date date = new Date();
        String result = formatter.showBug(date); // TRIGGER BUG: SimpleDateFormatNeedsLocale
        assertNotNull(result); // This assertion will fail if the bug is triggered
    }
}