import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));

        // Mutant code
        boolean isReachable = getReachabilityCondition();
        if (isReachable) {
            System.out.println("This code is reachable");
        } else {
            System.out.println("This code is unreachable");
        }
    }

    // Helper method to generate a reachability condition
    private static boolean getReachabilityCondition() {
        return Math.random() < 0.5;
    }
}