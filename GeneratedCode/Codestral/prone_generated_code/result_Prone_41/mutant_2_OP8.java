import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public Duration showBug(Duration duration) {
        Duration d = duration; // Added mutated code
        d.get(ChronoUnit.MINUTES); // This line will throw UnsupportedTemporalTypeException
        return duration;
    }

    public static void main(String[] args) {
        DurationGetTemporalUnitBug bug = new DurationGetTemporalUnitBug();
        Duration duration = Duration.ofSeconds(120);
        bug.showBug(duration);
    }
}