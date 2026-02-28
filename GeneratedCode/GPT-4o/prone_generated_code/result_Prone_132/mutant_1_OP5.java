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
        // BUG: Period.from(Duration) throws a DateTimeException
        Period period = Period.from(duration); // BUG: PeriodFrom

        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 99: // This case will not be reached
                System.out.println("Unreachable case executed.");
                break;
        }

        return period.toString(); // This line will not be reached
    }

    // This method demonstrates the bug when a Period is passed
    public static Period showBugWithPeriod() {
        Period inputPeriod = Period.ofDays(5);
        // BUG: Period.from(Period) returns itself
        Period period = Period.from(inputPeriod); // BUG: PeriodFrom

        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 99: // This case will not be reached
                System.out.println("Unreachable case executed.");
                break;
        }

        return period; // Returns the same period
    }

    // A method to simulate a condition that is false at runtime
    private static int getUnreachableValue() {
        return -1; // Always returns -1, making the switch case unreachable
    }
}