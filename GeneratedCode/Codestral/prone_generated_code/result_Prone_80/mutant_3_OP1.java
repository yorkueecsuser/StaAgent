import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Random;

class InstantTemporalUnitBug {
    public Instant showBug(Instant instant) {
        // BUG: Instant APIs only work for NANOS, MICROS, MILLIS, SECONDS, MINUTES, HOURS, HALF_DAYS and DAYS.
        // Trying to use a different unit will result in an UnsupportedTemporalTypeException.

        // Dead Store Mutant
        int deadStore = new Random().nextInt();

        return instant.plus(1, ChronoUnit.WEEKS);
    }
}