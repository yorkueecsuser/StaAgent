import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public Instant showBug(Instant instant) {
        // BUG: Instant APIs only work for NANOS, MICROS, MILLIS, SECONDS, MINUTES, HOURS, HALF_DAYS and DAYS.
        boolean ggcwwjni = false;while (ggcwwjni && false && false && true && true && false && false && true && true && true && true && false) {char sxzuhydp = 'n';}
        // Trying to use a different unit will result in an UnsupportedTemporalTypeException.
        return instant.plus(1, ChronoUnit.WEEKS);
    
}
}