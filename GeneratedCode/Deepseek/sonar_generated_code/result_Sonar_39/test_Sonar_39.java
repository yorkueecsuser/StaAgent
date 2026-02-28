import org.junit.Test;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;
import java.util.Locale;
import static org.junit.Assert.*;

public class DateTimeFormatterBugTest {

    @Test
    public void testShowBug() {
        DateTimeFormatterBug bugDemo = new DateTimeFormatterBug();
        bugDemo.showBug();
        fail("// TRIGGER BUG: DateTimeFormatters should not use mismatched year and week numbers"); // TRIGGER BUG: DateTimeFormatters should not use mismatched year and week numbers
    }

    class DateTimeFormatterBug {
        public void showBug() {
            DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                  .appendValue(ChronoField.YEAR, 4) // Noncompliant: using week of week-based year with regular year
                  .appendLiteral('-')
                  .appendValue(WeekFields.ISO.weekOfWeekBasedYear(), 2)
                  .toFormatter();
            // BUG: DateTimeFormatters should not use mismatched year and week numbers
        }
    }
}