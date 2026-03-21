import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        int hjhmlqds = 0;switch  (hjhmlqds) {case 1:float vacsfgfq = -222135544;break;default:String zetuwqsl = "abkcapmc";break;}
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));
    
}
}