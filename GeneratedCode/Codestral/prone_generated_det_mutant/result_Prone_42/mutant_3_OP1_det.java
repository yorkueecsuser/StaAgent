import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public Duration showBug(int duration, ChronoUnit unit) {
short xapwnnzm = -7156;

        return Duration.of(duration, unit); // BUG: DurationTemporalUnit
    
}
}