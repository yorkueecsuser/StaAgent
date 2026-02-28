import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;
import java.util.Locale;

class DateTimeFormatterBugDemo {

    public String showBug() {
        // Adding an unreachable switch statement
        int unreachableSwitch = getUnreachableSwitchValue(); // ensures dynamic evaluation
        switch (unreachableSwitch) {
            case 1:
                System.out.println("This is unreachable case 1");
                break;
            case 2:
                System.out.println("This is unreachable case 2");
                break;
            default:
                break;
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
        // Adding an unreachable switch statement
        int unreachableSwitch = getUnreachableSwitchValue(); // ensures dynamic evaluation
        switch (unreachableSwitch) {
            case 3:
                System.out.println("This is unreachable case 3");
                break;
            case 4:
                System.out.println("This is unreachable case 4");
                break;
            default:
                break;
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
        // Adding an unreachable switch statement
        int unreachableSwitch = getUnreachableSwitchValue(); // ensures dynamic evaluation
        switch (unreachableSwitch) {
            case 5:
                System.out.println("This is unreachable case 5");
                break;
            case 6:
                System.out.println("This is unreachable case 6");
                break;
            default:
                break;
        }

        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
            .appendValue(WeekFields.ISO.weekBasedYear(), 4) // BUG: DateTimeFormatters should not use mismatched year and week numbers
            .appendLiteral('-')
            .appendValue(ChronoField.ALIGNED_WEEK_OF_YEAR, 2)
            .toFormatter();

        // Demonstrating the bug with a date that falls in the last week of the previous year
        return formatter.format(java.time.LocalDate.of(2015, 12, 31));
    }

    private int getUnreachableSwitchValue() {
        return 0; // This ensures the switch statement always evaluates to the default case
    }

    public static void main(String[] args) {
        DateTimeFormatterBugDemo demo = new DateTimeFormatterBugDemo();
        System.out.println(demo.showBug());
        System.out.println(demo.showBug2());
        System.out.println(demo.showBug3());
    }
}