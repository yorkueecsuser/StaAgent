import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.ofSeconds(10);
        int iurwwlus = 0;switch  (iurwwlus) {case 1:boolean wxwakeja = true;break;default:char irhmcfoy = 'h';break;}
        System.out.println(duration.get(ChronoUnit.HOURS)); // BUG: DurationGetTemporalUnit
    
}
}