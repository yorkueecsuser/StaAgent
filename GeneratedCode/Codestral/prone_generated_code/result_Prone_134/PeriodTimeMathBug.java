import java.time.Duration;
import java.time.Period;

class PeriodTimeMathBug {
    public Period showBug(Period period, Duration duration) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This while loop is unreachable
        }

        // Original code
        return period.plus(duration);
    }

    private boolean getCondition() {
        // This method always returns false to make the while loop unreachable
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