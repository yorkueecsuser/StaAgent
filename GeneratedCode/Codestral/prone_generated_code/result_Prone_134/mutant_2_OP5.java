import java.time.Duration;
import java.time.Period;

class PeriodTimeMathBug {
    public Period showBug(Period period, Duration duration) {
        boolean unreachableCondition = falseFunction();
        switch (unreachableCondition) {
            case true:
                System.out.println("This should not be printed");
                break;
            default:
                break;
        }
        // BUG: PeriodTimeMath
        return period.plus(duration);
    }

    private boolean falseFunction() {
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