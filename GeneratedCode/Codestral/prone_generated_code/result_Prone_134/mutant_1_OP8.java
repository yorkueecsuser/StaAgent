import java.time.Duration;
import java.time.Period;

class PeriodTimeMathBug {
    public Period showBug(Period p1, Duration d1) {
        // BUG: PeriodTimeMath
        return p1.plus(d1);
    }

    public static void main(String[] args) {
        Period period = Period.ofYears(1);
        Duration duration = Duration.ofDays(1);
        PeriodTimeMathBug bug = new PeriodTimeMathBug();
        Period result = bug.showBug(period, duration);
        System.out.println(result);

        // Mutation: Renaming
        Period t = period;
        Duration u = duration;
        Period result2 = bug.showBug(t, u);
        System.out.println(result2);
    }
}