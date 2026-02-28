import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;
import java.util.Locale;

class DateTimeFormatterBug {
    public void showBug() {
        DateTimeFormatter formatter1 = new DateTimeFormatterBuilder()
               .appendValue(ChronoField.YEAR, 4) // Noncompliant: using week of week-based year with regular year
               .appendLiteral('-')
               .appendValue(WeekFields.ISO.weekOfWeekBasedYear(), 2)
               .toFormatter(Locale.ENGLISH);

        System.out.println(formatter1.format(LocalDate.of(2016, 1, 1))); // Bug: DateTimeFormatters should not use mismatched year and week numbers

        DateTimeFormatter formatter2 = new DateTimeFormatterBuilder()
               .appendValue(WeekFields.ISO.weekBasedYear(), 4) // Noncompliant: using aligned week of year with week-based year
               .appendLiteral('-')
               .appendValue(ChronoField.ALIGNED_WEEK_OF_YEAR, 2)
               .toFormatter(Locale.ENGLISH);

        System.out.println(formatter2.format(LocalDate.of(2016, 1, 1))); // Bug: DateTimeFormatters should not use mismatched year and week numbers
    }

    public static void main(String[] args) {
        DateTimeFormatterBug bug = new DateTimeFormatterBug();
        bug.showBug();
    }
}