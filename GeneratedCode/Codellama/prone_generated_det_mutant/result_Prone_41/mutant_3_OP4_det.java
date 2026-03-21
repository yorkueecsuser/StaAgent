import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.ofSeconds(10);
        if (false && false && false && true && false && false && false && false && true && false && false) {byte svhzlzdh = 44;}else{short rinfxnjo = -7355;}
        System.out.println(duration.get(ChronoUnit.HOURS)); // BUG: DurationGetTemporalUnit
    
}
}