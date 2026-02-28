import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));
    }
}

/* Mutant 1: Renaming of variable "instant" to "currentInstant" */
class InstantTemporalUnitBug {
    public static void main(String[] args) {
        Instant currentInstant = Instant.now();
        
        // BUG: InstantTemporalUnit
        System.out.println(currentInstant.plus(10, ChronoUnit.MONTHS));
    }
}

/* Mutant 2: Renaming of variable "ChronoUnit" to "temporalUnit" */
class InstantTemporalUnitBug {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        System.out.println(instant.plus(10, temporalUnit.MONTHS));
    }
}