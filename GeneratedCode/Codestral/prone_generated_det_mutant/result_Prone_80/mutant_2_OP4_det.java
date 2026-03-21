import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public Instant showBug(Instant instant) {
        // BUG: Instant APIs only work for NANOS, MICROS, MILLIS, SECONDS, MINUTES, HOURS, HALF_DAYS and DAYS.
        if (false && true && true && false && true && true && true && false && false && false && false) {boolean yvnbskor = false;}else{long nhxaajez = -861353478;}
        // Trying to use a different unit will result in an UnsupportedTemporalTypeException.
        return instant.plus(1, ChronoUnit.WEEKS);
    
}
}