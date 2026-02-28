import java.time.Duration;
import java.time.Period;

class PeriodTimeMathBug {
    public Period showBug(Period period, Duration duration) {
        // BUG: PeriodTimeMath
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 1:
                // Unreachable code
                System.out.println("This code should never execute");
                break;
            default:
                // Original code
                break;
        }
        return period.plus(duration);
    }

    private int getUnreachableValue() {
        // This method always returns a value other than 1
        return -1;
    }

    public static void main(String[] args) {
        Period period = Period.ofYears(1);
        Duration duration = Duration.ofDays(1);
        PeriodTimeMathBug bug = new PeriodTimeMathBug();
        Period result = bug.showBug(period, duration);
        System.out.println(result);
    }
}