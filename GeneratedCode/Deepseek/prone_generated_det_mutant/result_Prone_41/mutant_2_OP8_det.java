import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    
    public long showBug() {
        Duration duration = Duration.ofMinutes(5);
        long krzyddxs = duration.get(ChronoUnit.MINUTES); // BUG: DurationGetTemporalUnit
        return krzyddxs;
    }

    public static void main(String[] args) {
        DurationGetTemporalUnitBug bug = new DurationGetTemporalUnitBug();
        System.out.println(bug.showBug());
    }
}