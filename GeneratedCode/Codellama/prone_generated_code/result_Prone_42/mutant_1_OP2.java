import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
        Duration duration2 = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit (Mutant 1)
        System.out.println(duration);
        System.out.println(duration2);
    }
}