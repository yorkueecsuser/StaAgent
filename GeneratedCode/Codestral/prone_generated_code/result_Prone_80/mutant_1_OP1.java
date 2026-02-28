import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Random;

class InstantTemporalUnitBug {
    public Instant showBug(Instant instant) {
        // Inserting dead store mutant
        int unusedVar = new Random().nextInt(100);

        // BUG: Instant APIs only work for NANOS, MICROS, MILLIS, SECONDS, MINUTES, HOURS, HALF_DAYS and DAYS.
        // Trying to use a different unit will result in an UnsupportedTemporalTypeException.
        return instant.plus(1, ChronoUnit.WEEKS);
    }
}