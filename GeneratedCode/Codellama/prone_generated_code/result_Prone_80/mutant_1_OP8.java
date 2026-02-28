import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));
        
        // MUTANT: Renaming
        Instant x = Instant.now();
        System.out.println(x.plus(10, ChronoUnit.MONTHS));
    }
}