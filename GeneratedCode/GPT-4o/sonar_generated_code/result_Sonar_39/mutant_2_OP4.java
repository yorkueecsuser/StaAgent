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

        // Unreachable if-else branch
        boolean condition = alwaysFalse();
        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This is the reachable else block.");
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

        // Unreachable if-else branch
        boolean condition = alwaysFalse();
        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This is the reachable else block.");
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

        // Unreachable if-else branch
        boolean condition = alwaysFalse();
        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This is the reachable else block.");
        }

        // Demonstrating the bug with a date that falls in the last week of the previous year
        return formatter.format(java.time.LocalDate.of(2015, 12, 31));
    }

    // Helper method to ensure the condition is not a compile-time constant
    private boolean alwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        DateTimeFormatterBugDemo demo = new DateTimeFormatterBugDemo();
        System.out.println(demo.showBug());
        System.out.println(demo.showBug2());
        System.out.println(demo.showBug3());
    }
}