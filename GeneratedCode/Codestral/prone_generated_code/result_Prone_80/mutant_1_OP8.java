import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public Instant showBug(Instant instant) {
        // Original code
        // return instant.plus(1, ChronoUnit.WEEKS);

        // Mutant code
        Instant i = instant;
        return i.plus(1, ChronoUnit.WEEKS);
    }
}