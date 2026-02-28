import java.time.Duration;
import java.time.Period;

class PeriodTimeMathBug {
    public Period showBug(Period period, Duration duration) {
        // BUG: PeriodTimeMath
        int unreachableValue = 0;
        switch(unreachableValue) {
            case 1:
                System.out.println("This is an unreachable code block.");
                break;
        }
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