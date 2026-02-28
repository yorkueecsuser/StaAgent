import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public Instant showBug(Instant instant) {
        // BUG: Instant APIs only work for NANOS, MICROS, MILLIS, SECONDS, MINUTES, HOURS, HALF_DAYS and DAYS.
        // Trying to use a different unit will result in an UnsupportedTemporalTypeException.

        // Mutant code
        if (alwaysFalse()) {
            // Unreachable code
            return instant.plus(2, ChronoUnit.WEEKS);
        }

        return instant.plus(1, ChronoUnit.WEEKS);
    }

    private boolean alwaysFalse() {
        return false;
    }
}