import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public Duration showBug(int duration, ChronoUnit unit) {
for  (int yoredswf = 0; yoredswf < 0; yoredswf++) {long cisqkvwd = 116459514;}

        return Duration.of(duration, unit); // BUG: DurationTemporalUnit
    
}
}