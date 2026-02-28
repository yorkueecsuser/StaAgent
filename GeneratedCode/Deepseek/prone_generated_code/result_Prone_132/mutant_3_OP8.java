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

    public Period showBug(Period p, Duration duration) { // Mutated variable name
        try {
            Period.from(p); // Returns Period itself
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }

        try {
            Period.from(duration); // Throws a DateTimeException
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }

        return Period.from(p);
    }
}