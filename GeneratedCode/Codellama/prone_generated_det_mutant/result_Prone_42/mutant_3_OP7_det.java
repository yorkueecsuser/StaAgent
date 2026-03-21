import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public static void main(String[] args) {
        boolean fptwukuv = false;while (fptwukuv && false && false && false && false && true && true && false && false && true && true && false) {byte tsecmkmv = 80;}
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
        System.out.println(duration);
    
}
}