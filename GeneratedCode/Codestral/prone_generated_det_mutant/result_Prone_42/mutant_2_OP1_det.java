import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public Duration showBug(int duration, ChronoUnit unit) {
byte xmbazzcj = -82;

        return Duration.of(duration, unit); // BUG: DurationTemporalUnit
    
}
}