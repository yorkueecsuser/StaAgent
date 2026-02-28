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

        // Inserted unreachable for loop with a condition that's always false at runtime
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never be printed");
        }

        return period.toString(); // This line will not be reached
    }

    // This method demonstrates the bug when a Period is passed
    public static Period showBugWithPeriod() {
        Period inputPeriod = Period.ofDays(5);
        // BUG: Period.from(Period) returns itself
        Period period = Period.from(inputPeriod); // BUG: PeriodFrom

        // Inserted unreachable for loop with a condition that's always false at runtime
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never be printed");
        }

        return period; // Returns the same period
    }
    
    // Method to simulate a condition that is always false
    public static boolean getFalseCondition() {
        return false;
    }
}