import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;
import java.util.Locale;

class DateTimeFormatterBug {
    public void showBug() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
              .appendValue(ChronoField.YEAR, 4) 
              .appendLiteral('-')
              .appendValue(WeekFields.ISO.weekOfMonth(), 2) // Renamed to weekOfMonth
              .toFormatter();
        // BUG: DateTimeFormatters should not use mismatched year and week numbers
    }

    public static void main(String[] args) {
        DateTimeFormatterBug bugDemo = new DateTimeFormatterBug();
        bugDemo.showBug();
    }
}