import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public Duration showBug(Duration duration) {
        // BUG: DurationGetTemporalUnit
        long unusedVariable = duration.get(ChronoUnit.MINUTES); // This line will throw UnsupportedTemporalTypeException
        return duration;
    }

    public static void main(String[] args) {
        DurationGetTemporalUnitBug bug = new DurationGetTemporalUnitBug();
        Duration duration = Duration.ofSeconds(120);
        int deadStoreVariable = 10; // Added dead store variable
        bug.showBug(duration);
    }
}