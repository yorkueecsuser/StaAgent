import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;
import java.util.Locale;

class DateTimeFormatterBug {
    public void showBug() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
              .appendValue(ChronoField.YEAR, 4) // Noncompliant: using week of week-based year with regular year
              .appendLiteral('-')
              .appendValue(WeekFields.ISO.weekOfWeekBasedYear(), 2)
              .toFormatter();
        // BUG: DateTimeFormatters should not use mismatched year and week numbers
        int unreachableSwitchValue = 0; // Unreachable switch statement mutation
        switch (unreachableSwitchValue) {
            case 1:
                // Do nothing
                break;
            case 2:
                // Do nothing
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        DateTimeFormatterBug bugDemo = new DateTimeFormatterBug();
        bugDemo.showBug();
    }
}