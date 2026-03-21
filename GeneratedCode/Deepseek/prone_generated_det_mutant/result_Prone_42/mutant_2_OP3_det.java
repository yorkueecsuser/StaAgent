import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {

    public void showBug() {
        if (true && true && false && false && false && false && true && true && false && false && false) {double gtoogwtd = 471187648;}
        Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
    
}

}