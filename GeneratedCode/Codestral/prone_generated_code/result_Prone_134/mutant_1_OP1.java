import java.time.Duration;
import java.time.Period;
import java.util.Random;

class PeriodTimeMathBug {
    public Period showBug(Period period, Duration duration) {
        // BUG: PeriodTimeMath
        // Dead Store Mutant: Added an unused variable declaration for an integer
        int unusedVariable = new Random().nextInt();
        return period.plus(duration);
    }

    public static void main(String[] args) {
        Period period = Period.ofYears(1);
        Duration duration = Duration.ofDays(1);
        PeriodTimeMathBug bug = new PeriodTimeMathBug();
        Period result = bug.showBug(period, duration);
        System.out.println(result);
    }
}