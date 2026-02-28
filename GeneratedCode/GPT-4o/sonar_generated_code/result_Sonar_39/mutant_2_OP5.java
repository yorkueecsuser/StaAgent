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

        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999: 
                System.out.println("This is unreachable code.");
                break;
            default:
                break;
        }

        // Demonstrating the bug with a date that falls in the first week of a new year
        return formatter.format(java.time.LocalDate.of(2016, 1, 1));
    }

    public String showBug2() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
            .appendValue(ChronoField.YEAR_OF_ERA, 4) // BUG: DateTimeFormatters should not use mismatched year and week numbers
            .appendLiteral('-')
            .appendValue(WeekFields.ISO.weekOfWeekBasedYear(), 2)
            .toFormatter();

        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1001: 
                System.out.println("This is unreachable code.");
                break;
            default:
                break;
        }

        // Demonstrating the bug with a date that falls in the first week of a new year
        return formatter.format(java.time.LocalDate.of(2016, 1, 1));
    }

    public String showBug3() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
            .appendValue(WeekFields.ISO.weekBasedYear(), 4) // BUG: DateTimeFormatters should not use mismatched year and week numbers
            .appendLiteral('-')
            .appendValue(ChronoField.ALIGNED_WEEK_OF_YEAR, 2)
            .toFormatter();

        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1002: 
                System.out.println("This is unreachable code.");
                break;
            default:
                break;
        }

        // Demonstrating the bug with a date that falls in the last week of the previous year
        return formatter.format(java.time.LocalDate.of(2015, 12, 31));
    }

    private int getUnreachableValue() {
        return -1; // Ensures the switch cases are not reached
    }

    public static void main(String[] args) {
        DateTimeFormatterBugDemo demo = new DateTimeFormatterBugDemo();
        System.out.println(demo.showBug());
        System.out.println(demo.showBug2());
        System.out.println(demo.showBug3());
    }
}