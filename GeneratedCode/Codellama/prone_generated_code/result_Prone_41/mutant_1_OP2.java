import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.ofSeconds(10);
        System.out.println(duration.get(ChronoUnit.HOURS)); // BUG: DurationGetTemporalUnit
        Duration duration2 = Duration.ofSeconds(10);
        System.out.println(duration2.get(ChronoUnit.HOURS)); // Mutant code
    }
}