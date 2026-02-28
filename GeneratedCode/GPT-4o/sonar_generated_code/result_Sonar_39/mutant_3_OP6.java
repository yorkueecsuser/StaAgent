import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;
import java.util.Locale;

class DateTimeFormatterBugDemo {

    // Method to simulate a runtime-dependent condition for the unreachable for loop
    private boolean getCondition() {
        return false;
    }

    public String showBug() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable loop code
            System.out.println("This is an unreachable for loop");
        }

        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
            .appendValue(ChronoField.YEAR, 4) // BUG: DateTimeFormatters should not use mismatched year and week numbers
            .appendLiteral('-')
            .appendValue(WeekFields.ISO.weekOfWeekBasedYear(), 2)
            .toFormatter();

        // Demonstrating the bug with a date that falls in the first week of a new year
        return formatter.format(java.time.LocalDate.of(2016, 1, 1));
    }

    public String showBug2() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable loop code
            System.out.println("This is an unreachable for loop");
        }

        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
            .appendValue(ChronoField.YEAR_OF_ERA, 4) // BUG: DateTimeFormatters should not use mismatched year and week numbers
            .appendLiteral('-')
            .appendValue(WeekFields.ISO.weekOfWeekBasedYear(), 2)
            .toFormatter();

        // Demonstrating the bug with a date that falls in the first week of a new year
        return formatter.format(java.time.LocalDate.of(2016, 1, 1));
    }

    public String showBug3() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable loop code
            System.out.println("This is an unreachable for loop");
        }

        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
            .appendValue(WeekFields.ISO.weekBasedYear(), 4) // BUG: DateTimeFormatters should not use mismatched year and week numbers
            .appendLiteral('-')
            .appendValue(ChronoField.ALIGNED_WEEK_OF_YEAR, 2)
            .toFormatter();

        // Demonstrating the bug with a date that falls in the last week of the previous year
        return formatter.format(java.time.LocalDate.of(2015, 12, 31));
    }

    public static void main(String[] args) {
        DateTimeFormatterBugDemo demo = new DateTimeFormatterBugDemo();
        System.out.println(demo.showBug());
        System.out.println(demo.showBug2());
        System.out.println(demo.showBug3());
    }
}