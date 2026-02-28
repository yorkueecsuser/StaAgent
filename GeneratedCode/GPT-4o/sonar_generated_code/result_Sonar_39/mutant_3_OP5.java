import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;
import java.util.Locale;

class DateTimeFormatterBugDemo {

    public String showBug() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
            .appendValue(ChronoField.YEAR, 4) // BUG: DateTimeFormatters should not use mismatched year and week numbers
            .appendLiteral('-')
            .appendValue(WeekFields.ISO.weekOfWeekBasedYear(), 2)
            .toFormatter();

        // Demonstrating the bug with a date that falls in the first week of a new year
        
        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999: // This case is never reached
                System.out.println("This is unreachable.");
                break;
        }

        return formatter.format(java.time.LocalDate.of(2016, 1, 1));
    }

    public String showBug2() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
            .appendValue(ChronoField.YEAR_OF_ERA, 4) // BUG: DateTimeFormatters should not use mismatched year and week numbers
            .appendLiteral('-')
            .appendValue(WeekFields.ISO.weekOfWeekBasedYear(), 2)
            .toFormatter();

        // Demonstrating the bug with a date that falls in the first week of a new year

        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 888: // This case is never reached
                System.out.println("This is also unreachable.");
                break;
        }

        return formatter.format(java.time.LocalDate.of(2016, 1, 1));
    }

    public String showBug3() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
            .appendValue(WeekFields.ISO.weekBasedYear(), 4) // BUG: DateTimeFormatters should not use mismatched year and week numbers
            .appendLiteral('-')
            .appendValue(ChronoField.ALIGNED_WEEK_OF_YEAR, 2)
            .toFormatter();

        // Demonstrating the bug with a date that falls in the last week of the previous year

        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 777: // This case is never reached
                System.out.println("This is still unreachable.");
                break;
        }

        return formatter.format(java.time.LocalDate.of(2015, 12, 31));
    }

    private int getUnreachableValue() {
        // Always returns a value that does not match any case in the switch statements
        return 0;
    }

    public static void main(String[] args) {
        DateTimeFormatterBugDemo demo = new DateTimeFormatterBugDemo();
        System.out.println(demo.showBug());
        System.out.println(demo.showBug2());
        System.out.println(demo.showBug3());
    }
}