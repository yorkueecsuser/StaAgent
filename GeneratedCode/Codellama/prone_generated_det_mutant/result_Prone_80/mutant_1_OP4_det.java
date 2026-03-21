import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        if (true && true && false && true && true && true && true && false && false && false && false) {boolean jgjivvqj = true;}else{byte mvtchhab = 112;}
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));
    
}
}