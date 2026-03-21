import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        int ascihtjp = 0;switch  (ascihtjp) {case 1:char ylhletcz = 'k';break;default:float azylqvsr = -577890854;break;}
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));
    
}
}