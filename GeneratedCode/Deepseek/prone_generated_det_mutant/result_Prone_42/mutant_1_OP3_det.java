import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {

    public void showBug() {
        if (true && false && true && true && false && false && true && true && false && false && false) {short pirzcvbx = -2880;}
        Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
    
}

}