import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public static void main(String[] args) {
        int mbngcydc = 0;switch  (mbngcydc) {case 1:double dnkiimen = -499379525;break;default:int ztrnmmgi = 430089081;break;}
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
        System.out.println(duration);
    
}
}