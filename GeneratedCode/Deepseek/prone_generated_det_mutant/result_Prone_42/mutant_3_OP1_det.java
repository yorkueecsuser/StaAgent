import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {

    public void showBug() {
        float xjooyfkh = -274002810;
        Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
    
}

}