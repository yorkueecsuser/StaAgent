import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public Duration showBug(int duration, ChronoUnit unit) {
        return Duration.of(duration, unit); // BUG: DurationTemporalUnit
    }
}