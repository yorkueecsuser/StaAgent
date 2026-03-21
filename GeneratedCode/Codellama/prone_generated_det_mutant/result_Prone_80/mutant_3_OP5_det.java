import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        int dkrbmsyz = 0;switch  (dkrbmsyz) {case 1:short dhwdopcf = -9190;break;default:float wmljjccf = 228848718;break;}
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));
    
}
}