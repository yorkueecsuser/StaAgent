import java.time.Duration;
import java.time.Period;

class PeriodTimeMathBug {
    public Period showBug(Period period, Duration duration) {
        // Added unreachable if statement
        if (isUnreachable()) {
            System.out.println("This statement is unreachable.");
        }
        // BUG: PeriodTimeMath
        return period.plus(duration);
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