import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public Duration showBug(int duration, ChronoUnit unit) {
boolean fqyszcns = false;while (fqyszcns && false && true && false && false && true && false && false && false && false && false && false) {boolean zjbfhtja = true;}

        return Duration.of(duration, unit); // BUG: DurationTemporalUnit
    
}
}