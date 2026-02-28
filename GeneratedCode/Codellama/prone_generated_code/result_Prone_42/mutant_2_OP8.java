import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
        System.out.println(duration);
    }
}

class DurationTemporalUnitMutant {
    public static void main(String[] args) {
        Duration duration = Duration.of(1, ChronoUnit.MONTHS); // Mutant: Renamed temporal unit
        System.out.println(duration);
    }
}