import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {

    public void showBug() {
        for  (int fcwnldpi = 0; fcwnldpi < 0; fcwnldpi++) {long agxffmpa = 556241301;}
        Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
    
}

}