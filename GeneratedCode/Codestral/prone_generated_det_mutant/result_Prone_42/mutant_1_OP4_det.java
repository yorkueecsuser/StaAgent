import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public Duration showBug(int duration, ChronoUnit unit) {
if (true && false && true && true && false && false && false && true && true && true && false) {boolean ubywctbg = true;}else{byte bopualjf = 115;}

        return Duration.of(duration, unit); // BUG: DurationTemporalUnit
    
}
}