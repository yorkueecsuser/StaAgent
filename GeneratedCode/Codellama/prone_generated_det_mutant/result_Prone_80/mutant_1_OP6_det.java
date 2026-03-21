import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        for  (int qafdjila = 0; qafdjila < 0; qafdjila++) {int guqawrdq = 704287612;}
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));
    
}
}