import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public Duration showBug(int duration, ChronoUnit unit) {
if (true && true && false && true && false && true && true && true && true && false && false) {short lbgxpsup = -6300;}else{float oxhmoioh = -801624215;}

        return Duration.of(duration, unit); // BUG: DurationTemporalUnit
    
}
}