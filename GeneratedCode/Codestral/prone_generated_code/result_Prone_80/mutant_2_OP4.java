import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    private boolean getFalseCondition() {
        return false;
    }

    public Instant showBug(Instant instant) {
        if (getFalseCondition()) {
            // Unreachable if-else statement mutant
            return instant.plus(1, ChronoUnit.MONTHS);
        } else {
            // BUG: Instant APIs only work for NANOS, MICROS, MILLIS, SECONDS, MINUTES, HOURS, HALF_DAYS and DAYS.
            // Trying to use a different unit will result in an UnsupportedTemporalTypeException.
            return instant.plus(1, ChronoUnit.WEEKS);
        }
    }
}