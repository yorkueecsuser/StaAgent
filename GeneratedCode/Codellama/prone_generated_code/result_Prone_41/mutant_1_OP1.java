import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.ofSeconds(10);
        int deadStore = 0; // Dead Store
        System.out.println(duration.get(ChronoUnit.HOURS)); // BUG: DurationGetTemporalUnit
    }
}