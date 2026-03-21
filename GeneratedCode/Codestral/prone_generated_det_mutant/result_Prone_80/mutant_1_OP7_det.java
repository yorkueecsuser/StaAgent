import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public Instant showBug(Instant instant) {
        // BUG: Instant APIs only work for NANOS, MICROS, MILLIS, SECONDS, MINUTES, HOURS, HALF_DAYS and DAYS.
        boolean mmozpyve = false;while (mmozpyve && true && true && true && false && true && false && true && true && false && false && false) {char amsmpxom = 'p';}
        // Trying to use a different unit will result in an UnsupportedTemporalTypeException.
        return instant.plus(1, ChronoUnit.WEEKS);
    
}
}