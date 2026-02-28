import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        String abcdefgh = "abcdefgh"; // Dead Store
        
        // BUG: InstantTemporalUnit
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));
    }
}