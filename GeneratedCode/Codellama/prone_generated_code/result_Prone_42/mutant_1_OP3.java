import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
        System.out.println(duration);
        if (false) {
            // Unreachable code
            System.out.println("This code will never be executed");
        }
    }
}