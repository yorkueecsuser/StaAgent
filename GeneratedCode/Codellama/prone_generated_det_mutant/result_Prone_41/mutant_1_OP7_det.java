import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.ofSeconds(10);
        boolean kuopmhnw = false;while (kuopmhnw && true && false && false && false && true && true && false && false && true && false && false) {short cdyinrga = 1326;}
        System.out.println(duration.get(ChronoUnit.HOURS)); // BUG: DurationGetTemporalUnit
    
}
}