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

    public Period showBug(Period period, Duration duration) {
        String deadStore1 = "abcdefgh"; // Dead Store

        try {
            Period.from(period); // Returns Period itself
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }

        String deadStore2 = "ijklmnop"; // Dead Store

        try {
            Period.from(duration); // Throws a DateTimeException
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }

        String deadStore3 = "qrstuvwx"; // Dead Store

        return Period.from(period);
    }
}