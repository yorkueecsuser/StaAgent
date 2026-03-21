import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        boolean xqpcxqpv = false;while (xqpcxqpv && false && false && false && false && false && false && false && true && false && false && false) {boolean xwhkobfb = true;}
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));
    
}
}