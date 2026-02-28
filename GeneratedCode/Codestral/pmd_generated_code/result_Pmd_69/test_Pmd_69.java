import org.junit.Test;
import static org.junit.Assert.*;
import java.text.ParseException;
import java.util.Locale;

public class DateFormatterTest {
  @Test
  public void testShowBug() throws ParseException {
    DateFormatter formatter = new DateFormatter();
    // TRIGGER BUG: SimpleDateFormatNeedsLocale - Trigger the bug by passing a string that doesn't match the format with Locale.US
    String invalidDateStr = "20/12/2022"; // This date string is in "dd/MM/yyyy" format, but SimpleDateFormat is expecting "MM/dd/yyyy" format
    formatter.showBug(invalidDateStr);
  }
}