import java.time.Period;
import java.time.Duration;
import java.time.DateTimeException;
import java.time.temporal.TemporalAmount;

class PeriodFromBugExample {

    public static void main(String[] args) {
        // Demonstrate the bug
        try {
            System.out.println(showBugWithDuration());
        } catch (DateTimeException e) {
            System.out.println("Caught DateTimeException: " + e.getMessage());
        }

        System.out.println(showBugWithPeriod());
    }

    // This method demonstrates the bug when a Duration is passed
    public static String showBugWithDuration() {
        Duration duration = Duration.ofDays(1);
        // Original assignment
        Period period = Period.from(duration); // BUG: PeriodFrom
        // Duplicated assignment
        period = Period.from(duration); // Mutation: duplicated assignment
        return period.toString(); // This line will not be reached
    }

    // This method demonstrates the bug when a Period is passed
    public static Period showBugWithPeriod() {
        Period inputPeriod = Period.ofDays(5);
        // Original assignment
        Period period = Period.from(inputPeriod); // BUG: PeriodFrom
        // Duplicated assignment
        period = Period.from(inputPeriod); // Mutation: duplicated assignment
        return period; // Returns the same period
    }
}