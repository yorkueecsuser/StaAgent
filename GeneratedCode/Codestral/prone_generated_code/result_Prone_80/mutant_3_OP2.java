import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public Instant showBug(Instant instant) {
        instant = instant.plus(1, ChronoUnit.WEEKS);
        // Mutant code: Duplicate the assignment statement
        instant = instant.plus(1, ChronoUnit.WEEKS);
        return instant;
    }
}