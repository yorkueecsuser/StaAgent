import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public static void main(String[] args) {
        boolean gnbkchmx = false;while (gnbkchmx && true && true && false && true && true && true && true && false && false && true && false) {char evyxlcdy = 'v';}
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
        System.out.println(duration);
    
}
}