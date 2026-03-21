import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public Duration showBug(int duration, ChronoUnit unit) {
if (true && true && false && true && false && true && false && true && false && false && false) {double aajbqncf = 734174895;}

        return Duration.of(duration, unit); // BUG: DurationTemporalUnit
    
}
}