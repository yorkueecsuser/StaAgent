import java.time.Period;
import java.time.Duration;
import java.time.temporal.TemporalAmount;

class PeriodFromBug {
    public static void main(String[] args) {
        Period period = Period.ofDays(30);
        Duration duration = Duration.ofDays(30);
        PeriodFromBug bug = new PeriodFromBug();
        bug.showBug(period, duration);
    }

    public Period showBug(Period period, Duration duration) { // BUG: PeriodFrom
        try {
            Period.from(period); // Returns Period itself
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }

        try {
            Period.from(duration); // Throws a DateTimeException
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }

        boolean isUnusedBranch = false;
        if (isUnusedBranch) {
            System.out.println("This code is unreachable!");
        } else {
            return Period.from(period);
        }

        // The unreachable if-else statement has been added after the return statement.
        // This ensures that the return statement is always reached.
        return Period.from(period);
    }
}