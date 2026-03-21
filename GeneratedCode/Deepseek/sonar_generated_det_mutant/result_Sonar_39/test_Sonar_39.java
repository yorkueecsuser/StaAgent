import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.WeekFields;
import java.time.temporal.ChronoField;

public class DateTimeFormatterBugTest {

    // Test class instantiation
    private DateTimeFormatterBug dateTimeFormatterBug = new DateTimeFormatterBug();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: DateTimeFormatters should not use mismatched year and week numbers
        // This test case should fail because the bug is being triggered
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
              .appendValue(ChronoField.YEAR, 4) // Noncompliant: using week of week-based year with regular year
              .appendLiteral('-')
              .appendValue(WeekFields.ISO.weekOfWeekBasedYear(), 2)
              .toFormatter();
        LocalDate dateToFormat = LocalDate.of(2016, 1, 1);
        String result = formatter.format(dateToFormat); // This should trigger the bug
        // Here we are asserting that the result is not equal to the expected value
        // If the bug is not triggered, this assertion will fail
        assertNotEquals("2016-53", result); // This assertion will fail if the bug is not triggered
    }
}