import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;

class DateTimeFormatterBugDemo {

    public String showBug1() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
            .appendValue(ChronoField.YEAR, 4) // BUG: DateTimeFormatters should not use mismatched year and week numbers
            .appendLiteral('-')
            .appendValue(WeekFields.ISO.weekOfWeekBasedYear(), 2)
            .toFormatter();
        LocalDate date = LocalDate.of(2016, 1, 1);
        
        // Mutant: Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
            System.out.println("This is an unreachable block in showBug1");
        } else {
            // This block will always execute
            System.out.println("This is the reachable block in showBug1");
        }
        
        return date.format(formatter);
    }

    public String showBug2() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
            .appendValue(ChronoField.YEAR_OF_ERA, 4) // BUG: DateTimeFormatters should not use mismatched year and week numbers
            .appendLiteral('-')
            .appendValue(WeekFields.ISO.weekOfWeekBasedYear(), 2)
            .toFormatter();
        LocalDate date = LocalDate.of(2016, 1, 1);
        
        // Mutant: Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
            System.out.println("This is an unreachable block in showBug2");
        } else {
            // This block will always execute
            System.out.println("This is the reachable block in showBug2");
        }
        
        return date.format(formatter);
    }

    public String showBug3() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
            .appendValue(WeekFields.ISO.weekBasedYear(), 4) // BUG: DateTimeFormatters should not use mismatched year and week numbers
            .appendLiteral('-')
            .appendValue(ChronoField.ALIGNED_WEEK_OF_YEAR, 2)
            .toFormatter();
        LocalDate date = LocalDate.of(2016, 1, 1);
        
        // Mutant: Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
            System.out.println("This is an unreachable block in showBug3");
        } else {
            // This block will always execute
            System.out.println("This is the reachable block in showBug3");
        }
        
        return date.format(formatter);
    }

    private boolean getCondition() {
        // Always returns false to ensure the if-block is unreachable
        return false;
    }

    public static void main(String[] args) {
        DateTimeFormatterBugDemo demo = new DateTimeFormatterBugDemo();
        System.out.println("Bug 1 Output: " + demo.showBug1());
        System.out.println("Bug 2 Output: " + demo.showBug2());
        System.out.println("Bug 3 Output: " + demo.showBug3());
    }
}