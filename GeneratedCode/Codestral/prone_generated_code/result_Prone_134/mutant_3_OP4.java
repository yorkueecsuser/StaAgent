import java.time.Duration;
import java.time.Period;

class PeriodTimeMathBug {
    public Period showBug(Period period, Duration duration) {
        // BUG: PeriodTimeMath
        boolean unreachableCondition = isUnreachable();
        if (unreachableCondition) {
            System.out.println("This is an unreachable block.");
        } else {
            return period.plus(duration);
        }
    }

    private boolean isUnreachable() {
        return false;
    }

    public static void main(String[] args) {
        Period period = Period.ofYears(1);
        Duration duration = Duration.ofDays(1);
        PeriodTimeMathBug bug = new PeriodTimeMathBug();
        Period result = bug.showBug(period, duration);
        System.out.println(result);
    }
}