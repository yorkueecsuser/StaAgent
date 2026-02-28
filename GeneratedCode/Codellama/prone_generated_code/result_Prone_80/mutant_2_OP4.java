import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));
        
        // Mutant code: Unreachable if-else statement
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is also unreachable");
        }
    }
    
    private static boolean getCondition() {
        return false;
    }
}