import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        boolean gkntwlzd = false;while (gkntwlzd && false && true && true && false && false && false && false && false && true && true && false) {float vfuafsny = 876079112;}
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));
    
}
}