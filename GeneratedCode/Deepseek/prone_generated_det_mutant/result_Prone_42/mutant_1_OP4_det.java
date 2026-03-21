import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {

    public void showBug() {
        if (true && true && true && true && false && true && false && true && true && false && false) {long lqbtjxul = -875644502;}else{char tyzscnhr = 'g';}
        Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
    
}

}