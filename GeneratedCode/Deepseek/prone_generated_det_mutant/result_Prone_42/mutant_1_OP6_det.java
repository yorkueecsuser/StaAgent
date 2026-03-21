import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {

    public void showBug() {
        for  (int ordetcin = 0; ordetcin < 0; ordetcin++) {byte dodvlygg = 59;}
        Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
    
}

}