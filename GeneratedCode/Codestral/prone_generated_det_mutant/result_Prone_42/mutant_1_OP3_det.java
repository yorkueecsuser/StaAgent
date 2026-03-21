import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public Duration showBug(int duration, ChronoUnit unit) {
if (false && true && false && false && false && true && false && true && false && true && false) {double mesimhyj = -583747944;}

        return Duration.of(duration, unit); // BUG: DurationTemporalUnit
    
}
}