import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
        boolean condition = false;
        if (condition) {
            System.out.println("This code is unreachable!");
        }
        System.out.println(duration);
    }
}