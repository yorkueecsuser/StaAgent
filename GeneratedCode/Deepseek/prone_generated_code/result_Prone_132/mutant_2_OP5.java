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

        // Mutation: Add an unreachable switch statement
        int unreachableSwitch = 0;
        switch(unreachableSwitch) {
            default:
            System.out.println("Unreachable code: This message should not print");
            break;
        }

        return Period.from(period);
    }
}