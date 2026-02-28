import java.time.Duration;
import java.time.Period;

class PeriodTimeMathBug {
    public Period showBug(Period period, Duration duration) {
        // Original code
        Period result = period.plus(duration);

        // Mutant code: Unreachable if-else statement
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println("This line should never print");
        } else {
            System.out.println("This line should always print");
        }

        return result;
    }

    public static void main(String[] args) {
        Period period = Period.ofYears(1);
        Duration duration = Duration.ofDays(1);
        PeriodTimeMathBug bug = new PeriodTimeMathBug();
        Period result = bug.showBug(period, duration);
        System.out.println(result);
    }
}