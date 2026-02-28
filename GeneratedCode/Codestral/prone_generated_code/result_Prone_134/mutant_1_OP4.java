import java.time.Duration;
import java.time.Period;

class PeriodTimeMathBug {
    public Period showBug(Period period, Duration duration) {
        if (getUnreachableCondition()) {     // Mutant - Unreachable if-else statement
            throw new RuntimeException("This block should be unreachable!");
        } else {
            // BUG: PeriodTimeMath
            return period.plus(duration);
        }
    }

    private boolean getUnreachableCondition() {
        return false;   // This condition is always false, making the if-statement unreachable
    }

    public static void main(String[] args) {
        Period period = Period.ofYears(1);
        Duration duration = Duration.ofDays(1);
        PeriodTimeMathBug bug = new PeriodTimeMathBug();
        Period result = bug.showBug(period, duration);
        System.out.println(result);
    }
}