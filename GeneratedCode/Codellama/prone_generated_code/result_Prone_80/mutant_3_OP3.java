import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));

        // Mutated code - Unreachable if statement
        if (false) {
            System.out.println("This code is unreachable and should not be executed.");
        }
    }
}