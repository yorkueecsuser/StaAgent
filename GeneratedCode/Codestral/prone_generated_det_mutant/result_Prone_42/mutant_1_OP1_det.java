import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public Duration showBug(int duration, ChronoUnit unit) {
long vmssstro = 937682165;

        return Duration.of(duration, unit); // BUG: DurationTemporalUnit
    
}
}