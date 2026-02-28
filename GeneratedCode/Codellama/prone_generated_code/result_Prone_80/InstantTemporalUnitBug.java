import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));
        
        // Mutation Operator: Unreachable while loop
        while (false) {
            // Unreachable code
            System.out.println("This line is unreachable");
        }
    }
}