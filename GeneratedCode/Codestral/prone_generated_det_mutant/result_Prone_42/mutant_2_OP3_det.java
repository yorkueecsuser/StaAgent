import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public Duration showBug(int duration, ChronoUnit unit) {
if (true && false && false && false && true && false && false && true && false && true && false) {String zvnzxwte = "elemrnrc";}

        return Duration.of(duration, unit); // BUG: DurationTemporalUnit
    
}
}