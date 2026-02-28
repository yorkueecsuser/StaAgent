import java.time.Duration;
import java.time.Period;
import java.time.temporal.TemporalAmount;

class PeriodTimeMathExample {

    public void showBug() {
        Period period = Period.ofDays(10);
        Duration duration = Duration.ofHours(5);

        // This line will throw a DateTimeException because Duration is incompatible with Period
        period.plus(duration); // BUG: PeriodTimeMath

        // Mutant code with renaming variable 'period' to 'a'
        Period a = Period.ofDays(10);
        try {
            a.plus(duration);
        } catch (Exception e) {
            System.out.println("Caught exception in mutant: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        PeriodTimeMathExample example = new PeriodTimeMathExample();
        try {
            example.showBug();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}