import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));
        
        // Mutant code - Unreachable for loop
        boolean reachable = false;
        for (int i = 0; reachable; i++) {
            System.out.println("This code is unreachable");
        }
    }
}