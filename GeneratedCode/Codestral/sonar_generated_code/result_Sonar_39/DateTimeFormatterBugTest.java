import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterBugTest {

    @Test
    public void showBugTest() {
        DateTimeFormatterBug bug = new DateTimeFormatterBug();

        bug.showBug();

        // TRIGGER BUG: DateTimeFormatters should not use mismatched year and week numbers
        assertEquals("2015-53", getFormattedDate(bug, LocalDate.of(2016, 1, 1), 1));
        assertEquals("2015-01", getFormattedDate(bug, LocalDate.of(2016, 1, 1), 2));
    }

    // Helper method to get formatted date from DateTimeFormatterBug class
    private String getFormattedDate(DateTimeFormatterBug bug, LocalDate date, int formatterNumber) {
        DateTimeFormatter formatter = (formatterNumber == 1)? bug.formatter1 : bug.formatter2;
        return formatter.format(date);
    }
}