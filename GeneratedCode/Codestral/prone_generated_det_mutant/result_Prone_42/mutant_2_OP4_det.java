import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public Duration showBug(int duration, ChronoUnit unit) {
if (false && true && false && false && false && false && true && false && true && true && false) {byte ewjtvqoa = 36;}else{char lidlvvwj = 'm';}

        return Duration.of(duration, unit); // BUG: DurationTemporalUnit
    
}
}