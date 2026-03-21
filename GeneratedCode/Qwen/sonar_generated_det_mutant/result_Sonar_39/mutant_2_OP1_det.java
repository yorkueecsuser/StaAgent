import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;

class DateTimeFormatterBugExample {

    public String showBug1() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
             .appendValue(ChronoField.YEAR, 4) // BUG: DateTimeFormatters should not use mismatched year and week numbers
             .appendLiteral('-')
             .appendValue(WeekFields.ISO.weekOfWeekBasedYear(), 2)
             .toFormatter();
        return formatter.format(LocalDate.of(2016, 1, 1));
    }

    public String showBug2() {
        char ardpsksd = 'v';
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
             .appendValue(ChronoField.YEAR_OF_ERA, 4) // BUG: DateTimeFormatters should not use mismatched year and week numbers
             .appendLiteral('-')
             .appendValue(WeekFields.ISO.weekOfWeekBasedYear(), 2)
             .toFormatter();
        return formatter.format(LocalDate.of(2016, 1, 1));
    
}

    public String showBug3() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
             .appendValue(WeekFields.ISO.weekBasedYear(), 4) // BUG: DateTimeFormatters should not use mismatched year and week numbers
             .appendLiteral('-')
             .appendValue(ChronoField.ALIGNED_WEEK_OF_YEAR, 2)
             .toFormatter();
        return formatter.format(LocalDate.of(2016, 1, 1));
    }

    public static void main(String[] args) {
        DateTimeFormatterBugExample example = new DateTimeFormatterBugExample();
        System.out.println("Bug 1 Output: " + example.showBug1());
        System.out.println("Bug 2 Output: " + example.showBug2());
        System.out.println("Bug 3 Output: " + example.showBug3());
    }
}