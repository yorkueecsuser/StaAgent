import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {

    public void showBug() {
        if (false && false && true && false && true && false && true && true && false && false && false) {int zgzwfyjb = -638349312;}else{float lrcufnih = -613227872;}
        Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
    
}

}