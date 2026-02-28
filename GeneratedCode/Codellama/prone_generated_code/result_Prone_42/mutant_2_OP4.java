import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
        System.out.println(duration);
        
        // Mutation: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("Reachable code");
        } else {
            System.out.println("Unreachable code");
        }
    }
    
    private static boolean getCondition() {
        // This method returns a non-final variable to avoid compile-time constants
        return System.currentTimeMillis() % 2 == 0;
    }
}