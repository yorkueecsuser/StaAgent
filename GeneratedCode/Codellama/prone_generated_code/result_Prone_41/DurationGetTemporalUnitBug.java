import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.ofSeconds(10);
        System.out.println(duration.get(ChronoUnit.HOURS)); // BUG: DurationGetTemporalUnit

        // ============= Unreachable while loop =============
        
        // 1. Create a non-final variable to use as the loop condition
        boolean condition = true;

        // 2. Insert an unreachable while loop with a false condition
        while (false) {
            // This code will never be executed
            System.out.println("This code is unreachable");
        }

        // ============= End of unreachable while loop =============
    }
}