import java.time.Duration;
import java.time.Period;

class PeriodTimeMathBug {
    public Period showBug(Period period, Duration duration) {
        boolean unreachableCondition = getUnreachableCondition();

        // Inserted unreachable for loop
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This loop is unreachable");
        }

        // BUG: PeriodTimeMath
        return period.plus(duration);
    }

    private boolean getUnreachableCondition() {
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