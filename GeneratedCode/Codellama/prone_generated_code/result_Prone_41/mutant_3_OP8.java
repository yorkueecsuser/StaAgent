import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.ofSeconds(10);
        System.out.println(duration.get(ChronoUnit.HOURS)); // BUG: DurationGetTemporalUnit

        // Renamed variable
        ChronoUnit temp = ChronoUnit.HOURS;
        System.out.println(duration.get(temp)); // BUG: DurationGetTemporalUnit
    }
}