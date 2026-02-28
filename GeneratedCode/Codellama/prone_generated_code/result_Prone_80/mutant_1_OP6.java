import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));
        
        // Unreachable for loop mutant
        for (int i = 0; false; i++) {
            // unreachable code
            System.out.println("This code will never be executed.");
        }
    }
}