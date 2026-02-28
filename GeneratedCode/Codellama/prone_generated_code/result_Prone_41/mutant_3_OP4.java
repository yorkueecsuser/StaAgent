import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.ofSeconds(10);
        System.out.println(duration.get(ChronoUnit.HOURS)); // BUG: DurationGetTemporalUnit

        // Unreachable if-else statement mutant
        if (false) {
            System.out.println("This branch is unreachable and will never execute");
        } else {
            System.out.println("This branch is reachable");
        }
    }
}