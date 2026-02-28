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

    public Period showBug(Period period, Duration duration) { // Mutated BUG: PeriodFrom
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

        // Unreachable for loop mutation
        boolean condition = false; // Mutation: Using non-final variable and not a compile-time constant like false directly
        for (int i = 0; condition; i++) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
        
        if (false) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }

        return Period.from(period);
    }
}