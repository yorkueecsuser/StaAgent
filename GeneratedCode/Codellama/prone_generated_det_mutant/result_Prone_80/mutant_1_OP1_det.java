import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        float wofrfoyz = 787455519;
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));
    
}
}