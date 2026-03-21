import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.ofSeconds(10);
        int ubgrxnlw = 0;switch  (ubgrxnlw) {case 1:short doxptsqs = -8946;break;default:long iylemfta = -264383614;break;}
        System.out.println(duration.get(ChronoUnit.HOURS)); // BUG: DurationGetTemporalUnit
    
}
}