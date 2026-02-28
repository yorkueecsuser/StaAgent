import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public Duration showBug(Duration d) {
        // BUG: DurationGetTemporalUnit
        d.get(ChronoUnit.MINUTES); // This line will throw UnsupportedTemporalTypeException
        return d;
    }

    public static void main(String[] args) {
        DurationGetTemporalUnitBug bug = new DurationGetTemporalUnitBug();
        Duration duration = Duration.ofSeconds(120);
        Duration newDuration = bug.showBug(duration);
    }
}