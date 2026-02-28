import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public Instant showBug(Instant instant) {
        // BUG: Instant APIs only work for NANOS, MICROS, MILLIS, SECONDS, MINUTES, HOURS, HALF_DAYS and DAYS.
        // Trying to use a different unit will result in an UnsupportedTemporalTypeException.

        // Added unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This code will never execute because the condition is always false.
        }

        return instant.plus(1, ChronoUnit.WEEKS);
    }

    private boolean getCondition() {
        return false;
    }
}