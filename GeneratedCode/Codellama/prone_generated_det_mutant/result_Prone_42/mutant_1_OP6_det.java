import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
        for  (int ipxmamkb = 0; ipxmamkb < 0; ipxmamkb++) {long aygykufg = -828173341;}
        System.out.println(duration);
    
}
}