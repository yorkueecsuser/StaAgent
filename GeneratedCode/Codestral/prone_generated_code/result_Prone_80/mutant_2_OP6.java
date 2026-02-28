import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public Instant showBug(Instant instant) {
        // BUG: Instant APIs only work for NANOS, MICROS, MILLIS, SECONDS, MINUTES, HOURS, HALF_DAYS and DAYS.
        // Trying to use a different unit will result in an UnsupportedTemporalTypeException.

        // Unreachable for loop mutant
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            // This loop will never be executed
        }

        return instant.plus(1, ChronoUnit.WEEKS);
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false to make the loop unreachable
    }
}