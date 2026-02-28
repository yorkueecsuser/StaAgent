import java.time.Duration;
import java.time.Period;

class PeriodTimeMathBug {
    public Period showBug(Period period, Duration duration) {
        // BUG: PeriodTimeMath
        boolean condition = getCondition();
        for (int i = 0; condition; i++) { // Unreachable for loop
            break;
        }
        return period.plus(duration);
    }

    private boolean getCondition() {
        return false; // Always false to make loop unreachable
    }

    public static void main(String[] args) {
        Period period = Period.ofYears(1);
        Duration duration = Duration.ofDays(1);
        PeriodTimeMathBug bug = new PeriodTimeMathBug();
        Period result = bug.showBug(period, duration);
        System.out.println(result);
    }
}