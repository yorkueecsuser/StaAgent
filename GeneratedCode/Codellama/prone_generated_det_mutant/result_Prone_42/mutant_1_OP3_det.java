import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
        if (false && true && false && true && true && true && true && true && false && true && false) {boolean vnqdyfyn = false;}
        System.out.println(duration);
    
}
}