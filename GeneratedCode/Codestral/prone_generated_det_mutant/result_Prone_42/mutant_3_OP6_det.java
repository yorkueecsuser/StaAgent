import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public Duration showBug(int duration, ChronoUnit unit) {
for  (int rsubpzyw = 0; rsubpzyw < 0; rsubpzyw++) {float xwkxvkok = -633398557;}

        return Duration.of(duration, unit); // BUG: DurationTemporalUnit
    
}
}