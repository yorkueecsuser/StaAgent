import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public static void main(String[] args) {
        boolean hppkanaq = false;while (hppkanaq && false && true && false && false && false && false && true && false && false && true && false) {float nbjnwphw = -493135571;}
        Duration duration = Duration.ofSeconds(10);
        System.out.println(duration.get(ChronoUnit.HOURS)); // BUG: DurationGetTemporalUnit
    
}
}