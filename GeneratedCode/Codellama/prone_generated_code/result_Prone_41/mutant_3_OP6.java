import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.ofSeconds(10);
        System.out.println(duration.get(ChronoUnit.HOURS)); // BUG: DurationGetTemporalUnit

        // Unreachable for loop mutant
        for (int i = 0; false; i++) {
            System.out.println("This code should not be reached!");
        }
    }
}