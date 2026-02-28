import java.time.Duration;
import java.time.Period;

class PeriodTimeMathBug {
    public Period showBug(Period p, Duration d) {
        // BUG: PeriodTimeMath
        Period r = p.plus(d);
        return r;
    }

    public static void main(String[] args) {
        Period x = Period.ofYears(1);
        Duration y = Duration.ofDays(1);
        PeriodTimeMathBug bug = new PeriodTimeMathBug();
        Period z = bug.showBug(x, y);
        System.out.println(z);
    }
}