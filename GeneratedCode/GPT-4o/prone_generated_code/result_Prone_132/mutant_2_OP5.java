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

        // Adding unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 100: // This block will not be reached
                System.out.println("Unreachable code");
                break;
        }
    }

    // This method demonstrates the bug when a Duration is passed
    public static String showBugWithDuration() {
        Duration duration = Duration.ofDays(1);
        // BUG: Period.from(Duration) throws a DateTimeException
        Period period = Period.from(duration); // BUG: PeriodFrom
        return period.toString(); // This line will not be reached
    }

    // This method demonstrates the bug when a Period is passed
    public static Period showBugWithPeriod() {
        Period inputPeriod = Period.ofDays(5);
        // BUG: Period.from(Period) returns itself
        Period period = Period.from(inputPeriod); // BUG: PeriodFrom
        return period; // Returns the same period
    }

    // Dynamic method to simulate an unreachable value
    private static int getUnreachableValue() {
        return (int) (Math.random() * 100); // Always returns a value between 0 and 99
    }
}