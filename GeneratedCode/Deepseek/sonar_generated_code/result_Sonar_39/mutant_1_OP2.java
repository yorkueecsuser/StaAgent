import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;
import java.util.Locale;

class DateTimeFormatterBug {
    public void showBug() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
              .appendValue(ChronoField.YEAR, 4) 
              .appendValue(ChronoField.YEAR, 4) // Mutant: code duplication
              .appendLiteral('-')
              .appendValue(WeekFields.ISO.weekOfWeekBasedYear(), 2)
              .toFormatter();
        // BUG: DateTimeFormatters should not use mismatched year and week numbers
    }

    public static void main(String[] args) {
        DateTimeFormatterBug bugDemo = new DateTimeFormatterBug();
        bugDemo.showBug();
    }
}