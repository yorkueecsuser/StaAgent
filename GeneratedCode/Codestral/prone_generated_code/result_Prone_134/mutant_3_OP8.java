import java.time.Duration;
import java.time.Period;

class PeriodTimeMathBug {
    public Period showBug(Period p, Duration d) {
        // BUG: PeriodTimeMath
        return p.plus(d);
    }

    public static void main(String[] args) {
        Period x = Period.ofYears(1); // renamed 'period' to 'x'
        Duration y = Duration.ofDays(1); // renamed 'duration' to 'y'
        PeriodTimeMathBug bug = new PeriodTimeMathBug();
        Period result = bug.showBug(x, y);
        System.out.println(result);
    }
}