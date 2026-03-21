import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        if (false && true && true && false && false && true && false && false && true && false && false) {double namutkxy = 853804302;}
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));
    
}
}