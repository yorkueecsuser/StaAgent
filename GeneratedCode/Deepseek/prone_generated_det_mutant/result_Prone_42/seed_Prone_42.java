import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {

    public void showBug() {
        Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
    }

}