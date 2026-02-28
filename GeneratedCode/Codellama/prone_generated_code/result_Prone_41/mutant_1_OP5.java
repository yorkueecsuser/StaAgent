import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.ofSeconds(10);
        System.out.println(duration.get(ChronoUnit.HOURS)); // BUG: DurationGetTemporalUnit

        // Mutation code starts
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println("Hello, world!");
        }
        // Mutation code ends
    }
}