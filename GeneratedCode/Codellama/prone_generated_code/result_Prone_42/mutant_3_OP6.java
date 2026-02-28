import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
        System.out.println(duration);
        
        // Unreachable for loop mutation
        for (int i = 0; false; i++) {
            System.out.println("This loop is unreachable");
        }
    }
}